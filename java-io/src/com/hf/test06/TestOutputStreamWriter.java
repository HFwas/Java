package com.hf.test06;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

/*
 * 编码：字符--》字节
 * 	  把字符流转为字节流的转换流
 * OutputStreamWriter：
 * 		把字符流转为字节流，并且可以指定编码
 */
public class TestOutputStreamWriter {
	@Test
	public void test03()throws IOException{
		//当前平台是UTF-8，文件是GBK
		//String：编码的方法  getBytes()
		//编码：字符--》字节
		String str = "柴老师永远18岁！永远美丽";
		FileOutputStream fos = new FileOutputStream("d:/io.txt");
		OutputStreamWriter oos = new OutputStreamWriter(fos, "GBK");
		
		oos.write(str);//数据：  str（字符）-->oos（字符）按照GBK编码为字节流-->fos --> io.txt
		
		oos.close();
		fos.close();
	}
	
	
	@Test
	public void test02()throws IOException{
		//当前平台是UTF-8，文件是GBK
		//String：编码的方法  getBytes()
		//编码：字符--》字节
		String str = "柴老师永远18岁！";
		FileOutputStream fos = new FileOutputStream("d:/io.txt");
		fos.write(str.getBytes("GBK"));
		fos.close();
	}
	
	
	@Test
	public void test01()throws IOException{
		//当前平台是UTF-8，文件是GBK
		String str = "柴老师永远18岁！";
		
		FileWriter fw = new FileWriter("d:/io.txt");
		fw.write(str);
		fw.close();
	}
}
