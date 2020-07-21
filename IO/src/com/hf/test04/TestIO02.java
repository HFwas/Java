package com.hf.test04;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

/*
 * 文件的IO操作：
 * Reader系列：
 * （1）int read() ：读取一个字符，正常返回是该字符的Unicode编码值
 * （2）int read(char[] cbuf) ：读取多个字符，读取的字符放到cbuf数组中，从cbuf的[0]开始存储，最多读取cbuf.length个
 * 		实际本次读取的字符的个数
 * （3）int read(char[] cbuf, int off, int len)  ：读取多个字符，读取的字符放到cbuf数组中，从cbuf的[off]开始存储，最多读取len个
 * 		实际本次读取的字符的个数
 * 如果流中没有数据可读，统统返回-1
 * 一、读取一个纯文本的文件
 * 步骤：
 * (1)选择IO流，创建IO对象
 * (2)读/写操作
 * (3)关闭IO流，释放资源
 */
public class TestIO02 {
	@Test
	public void test04() throws IOException{
		//1、选择IO流
		//因为是操作纯文本文件，所以这里选择字符流
		//因为是读取操作，所以选择字符输入流   FileReader
		FileReader fr = new FileReader("1.txt");//相对路径，相对于当前的项目
		
		//2、读取文件内容
		//数据流向： 1.txt --> fr流中 -->从流中开始读取
		char[] arr = new char[10];
		while(true){
			int len = fr.read(arr);
			if(len == -1){
				break;
			}
			System.out.print(new String(arr,0,len));
		}
		
		//3、关闭
		fr.close();
	}
	
	@Test
	public void test03() throws IOException{
		//1、选择IO流
		//因为是操作纯文本文件，所以这里选择字符流
		//因为是读取操作，所以选择字符输入流   FileReader
		FileReader fr = new FileReader("1.txt");//相对路径，相对于当前的项目
		
		//2、读取文件内容
		//数据流向： 1.txt --> fr流中 -->从流中开始读取
		char[] arr = new char[10];
		while(true){
			int len = fr.read(arr);
			if(len == -1){
				break;
			}
			System.out.println(new String(arr,0,len));
		}
		
		//3、关闭
		fr.close();
	}
	
	
	//IOException是FileNotFoundException的父类，都是编译时异常
	@Test
	public void test02() throws IOException{
		//1、选择IO流
		//因为是操作纯文本文件，所以这里选择字符流
		//因为是读取操作，所以选择字符输入流   FileReader
		FileReader fr = new FileReader("1.txt");//相对路径，相对于当前的项目
		
		//2、读取文件内容
		//数据流向： 1.txt --> fr流中 -->从流中开始读取
		char[] arr = new char[10];
		int len = fr.read(arr);
		System.out.println(len);
		
		//3、关闭
		fr.close();
	}
		
	
	//IOException是FileNotFoundException的父类，都是编译时异常
	@Test
	public void test01() throws IOException{
		//1、选择IO流
		//因为是操作纯文本文件，所以这里选择字符流
		//因为是读取操作，所以选择字符输入流   FileReader
		FileReader fr = new FileReader("1.txt");//相对路径，相对于当前的项目
		
		//2、读取文件内容
		//数据流向： 1.txt --> fr流中 -->从流中开始读取
		int data = fr.read();
		System.out.println(data);
		
		//3、关闭
		fr.close();
	}
}
