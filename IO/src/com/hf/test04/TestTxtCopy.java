package com.hf.test04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

//纯文本文件的复制
public class TestTxtCopy {
	@Test
	public void test01() throws IOException{
		long start = System.currentTimeMillis();
		copy("1.txt", "2.txt");
		long end = System.currentTimeMillis();
		System.out.println("毫秒：" + (end-start));
	}
	
	/*
	 * 纯文本文件的复制
	 */
	public void copy(String srcFileName, String destFileName) throws IOException{
		//1、选择IO流，并创建IO流
		FileReader fr = new FileReader(srcFileName);
		FileWriter fw = new FileWriter(destFileName);
		
		//2、一边读一边写
		char[] arr = new char[10];
		int len;
		//数据从  srcFileName文件 --》 fr --> arr数组 --> fw --> destFileName
		while((len = fr.read(arr)) != -1){
			fw.write(arr, 0, len);
		}
		
		//3、关闭
		fw.close();
		fr.close();
		
	}
}
