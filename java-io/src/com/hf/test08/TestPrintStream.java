package com.hf.test08;

import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

/*
 * 打印流：输出流
 * （1）PrintStream：
 * 		经典代表：System.out
 * 				Sysetm.err
 * 	new PrintStream(文件名)
 * 	new PrintStream(文件名,编码)
 * 	new PrintStream(另一个字节输出流)
 * （2）PrintWriter
 * 		Web阶段学习时，从服务器端往客户端返回消息时用到response，response.getWriter()可以返回PrintWriter对象。
 * 		即  Web服务器往客户端（例如：浏览器）返回html网页时，用的是PrintWriter对象的输出方法。
 */
public class TestPrintStream {
	@Test
	public void test04() throws IOException{
		//所有数据类型写出去，都是按照文本处理
		PrintStream ps = new PrintStream("1.txt");
		ps.println(12);
		ps.println(true);
		ps.println(new Goods("《从入门到放弃》", 99.99, 1000));
		ps.close();
	}
	
	@Test
	public void test03() throws IOException{
		PrintStream ps = new PrintStream("d:/1.txt","GBK");
		ps.println("中文");
		ps.close();
	}
	
	@Test
	public void test02() throws IOException{
		PrintStream ps = new PrintStream("1.txt");
		ps.println("hello");
		ps.println("world");
		ps.close();
	}
	
	@Test
	public void test01(){
		PrintStream out = System.out;
		out.println("hello");
		
//		out.print();
		out.println();
	}
}
