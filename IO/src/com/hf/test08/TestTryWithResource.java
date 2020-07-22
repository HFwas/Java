package com.hf.test08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

/*
 * JDK1.7中新增了一种try...catch处理的方式，
 * 称为try...with....resource，它是为资源关闭专门设计的try...catch的语法
 * 
 * try(
 * 		需要关闭的资源对象
 * ){
 * 		可能发生异常的逻辑代码
 * }catch(异常类型 e){
 * 		异常处理代码
 * }catch(异常类型 e){
 * 		异常处理代码
 * }
 * 
 * 凡是在try()中声明的资源对象，都会自动关闭，无论是否发生异常。
 */
public class TestTryWithResource {
	@Test
	public void test03() {
		//从d:/1.txt(GBK)文件中，读取内容，写到项目根目录下1.txt(UTF-8)文件中
		try(
			FileInputStream fis = new FileInputStream("d:/1.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK");
			BufferedReader br = new BufferedReader(isr);
			
			FileOutputStream fos = new FileOutputStream("1.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
		){
			String str;
			while((str = br.readLine()) != null){
				bw.write(str);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test02() {
		//从d:/1.txt(GBK)文件中，读取内容，写到项目根目录下1.txt(UTF-8)文件中
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/1.txt"),"GBK"));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("1.txt"),"UTF-8"));
			
			String str;
			while((str = br.readLine()) != null){
				bw.write(str);
				bw.newLine();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null){
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void test01(){
		//从d:/1.txt(GBK)文件中，读取内容，写到项目根目录下1.txt(UTF-8)文件中
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fis = new FileInputStream("d:/1.txt");
			isr = new InputStreamReader(fis,"GBK");
			br = new BufferedReader(isr);
			
			fos = new FileOutputStream("1.txt");
			osw = new OutputStreamWriter(fos,"UTF-8");
			bw = new BufferedWriter(osw);
			
			String str;
			while((str = br.readLine()) != null){
				bw.write(str);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null){
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(osw!=null){
					osw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(isr!=null){
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
/*	public static void main(String[] args) {
		//从d:/1.txt(GBK)文件中，读取内容，写到项目根目录下1.txt(UTF-8)文件中
		FileInputStream fis = new FileInputStream("d:/1.txt");
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str;
		while((str = br.readLine()) != null){
			bw.write(str);
			bw.newLine();
		}
		
		bw.close();
		osw.close();
		fos.close();
		
		br.close();
		isr.close();
		fis.close();
		
	}*/
}
