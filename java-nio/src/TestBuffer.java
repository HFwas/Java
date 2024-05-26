import java.nio.ByteBuffer;

import org.junit.Test;

/*
 * 一，缓冲区（Buffer）：在JavaNIO中负责数据的存取，缓冲区就是数组，用于存储不同数据类型的数据
 * 格局数据类型不同（*）,提供了不同类型的缓冲区
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 * 
 *上传缓冲区的管理方式几乎一致，通过allocate()获取缓冲区
 *
 *二：缓冲区存取数据的两个核心方法
 *put()：存入数据到缓冲区
 *get():获取缓冲区中的数据
 *
 *四：
 *capacity：容量，表示缓冲区中最大存储数据的容量，一旦声明不能改变
 *limit：界限，表示缓冲区可以操作数据的大小，（limit 后数据不能进行读写）
 *position：位置，表示缓冲区中正在操作数据的位置
 *
 *0 <= mark <= position <= limit <= capacity
 *
 *五：直接缓冲区与非直接缓冲区：
 *非直接缓冲区：通过allocate()方法分配缓冲区，将缓冲区建立在JVM的内存中
 *直接缓冲区：通过allocateDirect()方法分配直接缓冲区，将缓冲区简历在屋里内存中，可以提高效率
 */
public class TestBuffer {
	
	@Test
	public void test03() {
		//分配直接缓冲区
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
	
		System.out.println(buffer.isDirect());
	
	}
	
	@Test
	public void test02(){
		String str = "abcde";
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		buffer.put(str.getBytes());
		
		buffer.flip();
		
		byte[] dst = new byte[buffer.limit()];
		
		buffer.get(dst, 0, 2);
		System.out.println(new String(dst, 0, 2));
		System.out.println(buffer.position());
		
		// mark():标记
		buffer.mark();
		
		buffer.get(dst, 2, 2);
		System.out.println(new String(dst, 2, 2));
		System.out.println(buffer.position());
		
		//reset():恢复到mark标记位置
		buffer.reset();
		System.out.println(buffer.position());
		
		//判断缓冲区是否还有剩余数量
		if (buffer.hasRemaining()) {
			//获取缓冲区中可以操作的数量
			System.out.println(buffer.remaining());
		}
	}
	
	@Test
	public void test01(){
		
		String str = "abcde";
		//1。分配一个指定大小的缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		System.out.println("====allocate()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		//2.利用put（）存入数据到缓冲区中
		buffer.put(str.getBytes());
		System.out.println("====put()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		//3.切换到读取数据模式
		buffer.flip();
		System.out.println("====flip()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		//4.利用get() 读取缓冲区中的数据
		byte[] dst = new byte[buffer.limit()];
		buffer.get(dst);
		System.out.println(new String(dst, 0, dst.length));
		System.out.println("====get()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		//5.rewind():可重复读
		buffer.rewind();
		System.out.println("====rewind()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
	
		// 6.clear():清空缓冲区,但是缓冲区的数据依然存在，但是处于“被遗忘状态”
		buffer.clear();
		System.out.println("====clear()=====");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		System.out.println((char)buffer.get());
	}
	
	
}	
