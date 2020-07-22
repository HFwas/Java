package com.hf.test08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;
/*
 * System.in：默认情况下是从键盘输入的数据中扫描
 * Scanner：可以从你指定的文件、流中读取文本数据
 */
public class TestScanner {
	@Test
	public void test05() throws FileNotFoundException{
		Scanner input = new Scanner(new File("d:/1.txt"),"GBK");//InputStream
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	
	@Test
	public void test04() throws FileNotFoundException{
		Scanner input = new Scanner("1.txt");//InputStream
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	
	@Test
	public void test03() throws FileNotFoundException{
		Scanner input = new Scanner(new File("1.txt"));//InputStream
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	
	@Test
	public void test02() throws FileNotFoundException{
		Scanner input = new Scanner(new FileInputStream("1.txt"));//InputStream
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}
	
	@Test
	public void test01(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		System.out.println("num = " + num);
		input.close();
	}
}
