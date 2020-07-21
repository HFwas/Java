package com.hf.test06;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/*
 * 解码：  字节输入流转字符输入流的转换流，同时还能指定编码方式
 * InputStreamReader：
 */
public class TestInputStreamReader {
	@Test
	public void test03()throws IOException{
		//解码：字节-->字符
		FileInputStream fis = new FileInputStream("d:/io.txt");
		InputStreamReader isr = new InputStreamReader(fis,"GBK");//将fis流中的字节流按照GBK进行解码为字符流
		//数据：d:/io.txt(GBK)-->fis（纯字节）-->isr（GBK）解成字符流-->按字符读取
		char[] arr = new char[3];
		int len = isr.read(arr);
		System.out.println(new String(arr,0,len));
		
		isr.close();
		fis.close();
	}
	
	@Test
	public void test02() throws IOException{
		//String：解码
		//解码：字节-->字符
		FileInputStream fis = new FileInputStream("d:/io.txt");
		byte[] arr = new byte[10];
		int len = fis.read(arr);
		//String(byte[] bytes, String charsetName)
		//String(byte[] bytes, int offset, int length, String charsetName)
		System.out.println(new String(arr,0,len,"GBK"));
		fis.close();
	}
	
	@Test
	public void test01() throws IOException{
		//乱码：d:/io.txt的编码是GBK，平台是UTF-8
		FileReader fr = new FileReader("d:/io.txt");
		char[] arr = new char[1024];
		int len = fr.read(arr);
		System.out.println(new String(arr,0,len));
		fr.close();
	}
}
