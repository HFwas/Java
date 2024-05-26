import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import org.junit.Test;

/**
 * 一：通道(Channel):用于源节点与目标节点的连接，在JAVA NIO中负责缓冲区中数据的传输，Cahnnel本身不存储数据，因此需要配合缓冲区进行传输
 * 
 * 二。通道的主要实现类
 * java.io.channels.Channel接口
 * 		|--FileChannel
 * 		|--SocketChannel
 * 		|--ServeSocketChannel
 * 		|--DatagramChannel
 * 
 * 三。获取通道
 * 1.Java针对支持通道的类提供了getChannel()方法
 * 		本地IO
 * 		FileInputStream/FileOutputStream
 * 		RandomAccessFile
 * 
 * 		网络IO
 * 		Socket
 * 		ServerSocket
 * 		DatagramSocket
 *2.在JDK 1.7 中的NIO。2针对各个通道提供了静态方法open()
 *3..在JDK 1.7 中的NIO。2的Files工具类的newByteChannel()
 *
 *四：通道之间的数据传输
 *transferFrom()
 *transferTo()
 *
 *五：分散(Scatter)和聚集(Gather)
 *分散读取(Scattering Reads)：将通道中的数据分散到多个缓冲区中
 *聚集写入(Gathering Writes)：将多个缓冲区中的数据聚集到通道中
 *
 *六：字符集：ChaSet
 *编码：字符串->字节数组
 *解码：字节数组 ->字符串
 */
public class TestChannel {  
	
	//字符集
	@Test
	public void test06() throws IOException{
		Charset charset = Charset.forName("GBK");

		//获取编码器
		CharsetEncoder newEncoder = charset.newEncoder();
		//获取解码器
		CharsetDecoder newDecoder = charset.newDecoder();
		
		CharBuffer buffer = CharBuffer.allocate(1024);
		
		buffer.put("尚硅谷牛逼：");
		buffer.flip();
		
		//编码
		ByteBuffer encode = newEncoder.encode(buffer);
		for (int i = 0; i < 12; i++) {
			System.out.println(encode.get());
		}
		
		//解码
		encode.flip();
		CharBuffer decode = newDecoder.decode(encode);
		System.out.println(decode.toString());
		System.out.println("===========");
		
		Charset charset2 = Charset.forName("UTF-8");
		encode.flip();
		CharBuffer decode2 = newDecoder.decode(encode);
		System.out.println(decode2.toString());
	}
	
	@Test
	public void test05(){
		
		Map<String,Charset> map = Charset.availableCharsets();
	
		Set<Entry<String , Charset>> set = map.entrySet();
		
		for (Entry<String, Charset> entry : set) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test04() throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("1.txt", "rw");
		
		//1.获取通道
		FileChannel channel1 = raf.getChannel();
		//2.分配指定大小的缓冲区
		ByteBuffer buf1 = ByteBuffer.allocate(100);
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		
		//3.分散读取
		ByteBuffer[] dsts = {buf1,buf2};
		channel1.read(dsts);
		
		for (ByteBuffer byteBuffer : dsts) {
			byteBuffer.flip();
		}
		
		System.out.println(new String(dsts[0].array(), 0, buf1.limit()));
		System.out.println("=============================");
		System.out.println(new String(dsts[1].array(), 0, buf2.limit()));
		
		//4.聚集写入
		RandomAccessFile raf2 = new RandomAccessFile("2.txt", "rw");
		FileChannel channel2 = raf2.getChannel();
		
		channel2.write(dsts);
	}
	
	//通道之间的传输（直接缓冲区）
	@Test
	public void test03() throws IOException{
		
		FileChannel inChannel = FileChannel.open(Paths.get("D:/file/1.avi"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("D:/file/2.avi"), StandardOpenOption.WRITE,StandardOpenOption.READ, StandardOpenOption.CREATE);
		
		//inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.transferFrom(inChannel, 0, inChannel.size());
		
		inChannel.close();
		outChannel.close();
		
	}

	//使用直接缓冲区完成文件的复制（内存映射）
	@Test
	public void test02() throws IOException {//耗费时间：573   耗费时间：548
		
		long start = System.currentTimeMillis();
		
		FileChannel inChannel = FileChannel.open(Paths.get("D:/file/1.avi"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("D:/file/2.avi"), StandardOpenOption.WRITE,StandardOpenOption.READ, StandardOpenOption.CREATE);
		
		//内存映射文件
		MappedByteBuffer inMappedByteBuffer = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outMappedByteBuffer = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		
		//直接对缓冲区进行数据的读写操作
		byte[] dst = new byte[inMappedByteBuffer.limit()];
		inMappedByteBuffer.get(dst);
		outMappedByteBuffer.put(dst);
		
		inChannel.close();
		outChannel.close();
		
		long end = System.currentTimeMillis();
		System.out.println("耗费时间："+(end-start));
		
	}
	
	//利用通道完成文件的复制(非直接缓冲区)
	@Test
	public void test01() {//耗费时间：4413  4074

		
		long start = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//获取通道
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			fis = new FileInputStream("D:/file/1.avi");
			fos = new FileOutputStream("D:/file/2.avi");
			
			inChannel = fis.getChannel();
			outChannel = fos.getChannel();
			
			//分配指定大小的缓冲区
			ByteBuffer buf = ByteBuffer.allocate(1024);
			//将通道中的数据存入缓冲区中
			while (inChannel.read(buf) != -1) {
				buf.flip();//切换读取数据的模式
				//将缓冲区中的数据写入通道中
				outChannel.write(buf);
				buf.clear();//清空缓冲区
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (outChannel != null) {
				try {
					outChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inChannel != null) {
				try {
					inChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("耗费时间："+(end-start));
		
	}
	
}
