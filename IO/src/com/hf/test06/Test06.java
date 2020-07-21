package com.hf.test06;

import java.io.FileInputStream;
import java.io.IOException;
/*
 * InputStream:
 * (1)int read() ：一次读取一个字节，返回本次读取的字节的值
 * (2)int read(byte[] b) ：一次读取多个字节，返回本次实际读取字节数，读取的字节存到b数组中，从[0]开始存储，一次最多读取b.length个字节
 * (3)int read(byte[] b, int off, int len) ：一次读取多个字节，返回本次实际读取字节数，读取的字节存到b数组中，从[off]开始存储，一次最多读取len个字节
 * (4)close()
 * 如果到达流末尾，返回-1
 * 三、使用字节流，来读取纯文本文件
 * 步骤：
 * （1）选择IO流
 * （2）读/写
 * （3）关闭
 */
public class Test06 {
	public static void main(String[] args) throws IOException {
		//（1）选择IO流
		//这里故意选取字节流，因为字节流可以用于处理所有类型的问题
		FileInputStream fis = new FileInputStream("1.txt");
		
		//（2）读
		byte[] arr = new byte[10];
		int len;
		while((len = fis.read(arr)) != -1){
//			System.out.println(Arrays.toString(arr));
			
			//字节数组-->字符串  new String(byte[],off,len)
			System.out.println(new String(arr,0,len));//可能乱码
			//乱码的原因：本次读了10个字节，就用10个字节去组成字符串显示了，出现缺字节
		}
		
//		（3）关闭
		fis.close();
	}
}
