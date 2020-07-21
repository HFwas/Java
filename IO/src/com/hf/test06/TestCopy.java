package com.hf.test06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/*
 * OutputStream：
 * (1)void write(int b)  ：写一个字节
 * (2)void write(byte[] b) ：写一个字节数组的所有
 * (3)void write(byte[] b, int off, int len)  ：写一个字节数组的部分
 * (4) void close()  
 * (5)void flush() 
 */
public class TestCopy {
	@Test
	public void test02() throws IOException{
		copy("1.jpg", "2.jpg");
	}
	
	@Test
	public void test01() throws IOException{
		copy("1.txt", "3.txt");
		/*
		 * 这里没有乱码，把1.txt的所有字节，全部复制到3.txt中，然后一起显示，没有缺字节
		 * 而且1.txt和3.txt的编码是一致的
		 */
	}
	
	//复制任意类型的文件的功能
	//任意类型的文件，只能选择字节流
	public void copy(String srcFilename , String destFilename) throws IOException{
		FileInputStream fis = new FileInputStream(srcFilename);
		FileOutputStream fos = new FileOutputStream(destFilename);
		
		byte[] arr = new byte[10];
		int len;
		//数据： srcFilename --> fis --> arr --> fos --> destFilename
		while((len = fis.read(arr)) !=-1){
			fos.write(arr, 0, len);
		}
		
		fis.close();
		fos.close();
	}
}
