package com.hf.test06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/*
 * 缓冲IO流：
 *   是处理流，负责在其他IO流基础上增加缓冲功能。提高效率
 * BufferedReader ---> Reader
 * BufferedWriter ---> Writer
 * BufferedInputStream ---> InputStream
 * BufferedOutputStream ---> OutputStream
 * BufferedReader除了继承了Reader的那些读的方法，还增加了一个：String readLine()读取一行
 * BufferedWriter除了继承了Writer的那些写的方法，还增加了一个：void newLine()写换行符
 * 默认的缓冲区的大小：8192字节/字符
 */
public class TestBuffered {
	@Test
	public void test01() throws IOException{
		//用它来读取一个文件，因为控制台只能显示文本数据，所以我们这里用纯文本文件来演示
		FileReader fr = new FileReader("1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//数据：1.txt --> fr --> br
		String str ;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
	
	@Test
	public void test02()throws IOException{
		long start = System.currentTimeMillis();
		FileReader fr = new FileReader("1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("11.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str ;
		////数据：1.txt --> fr --> br --> str --> bw --> fw -- >11.txt
		while((str = br.readLine()) != null){
			bw.write(str);
			bw.newLine();//换行
		}
		
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		long end = System.currentTimeMillis();
		System.out.println("毫秒：" + (end-start));
	}
	
	
	@Test
	public void test03() throws IOException{
		long start = System.currentTimeMillis();
		copy("D:/software/IDEA/ideaIU-Ultimate-2017.1.4.exe","d:/idea.exe");
		long end = System.currentTimeMillis();
		System.out.println("毫秒：" + (end-start));
	}
	
	//复制任意类型的文件的功能
	//任意类型的文件，只能选择字节流
	public void copy(String srcFilename , String destFilename) throws IOException{
		FileInputStream fis = new FileInputStream(srcFilename);
		BufferedInputStream bis = new BufferedInputStream(fis);//fis比喻成内衣,bis是外套
		
		FileOutputStream fos = new FileOutputStream(destFilename);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] arr = new byte[10];
		int len;
		//数据： srcFilename --> fis --> arr --> fos --> destFilename
		while((len = bis.read(arr)) !=-1){
			bos.write(arr, 0, len);
		}
		
		bis.close();//先脱外套
		fis.close();//再脱内衣
		
		bos.close();
		fos.close();
	}
	
	@Test
	public void test05()throws IOException{
		FileWriter fw = new FileWriter("22.txt");
		fw.write("hello");
//		fw.write("\n");
		fw.write("\r\n");//\r本行结束，\n把光标移动到下一行
		fw.write("world");
		fw.close();
	}
}
