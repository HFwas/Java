package com.hf.demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
/*
 * java.io.File：类
 * 	文件和目录  路径名的抽象表示形式。
 * 	通俗的讲：File类的对象代表一个文件或一个目录（文件夹）
 * 1、路径的分隔符：
 * 	 windows：\ 和  /
 * 	 其他平台：/ 
 *  网络地址：http://www.baidu.com/index.html
 *  现在写路径分隔符：（1）/（2）File.separator
 * 2、API
 * (1)获取文件或目录的详细信息
 * getName()
 * long length()：只能返回文件的大小，不能直接返回目录的大小
 * 			文件夹的总大小 = 文件夹里面的所有的文件大小累加和
 * isHidden()
 * exist()
 * canRead()
 * canWrite()
 *long lastModified()
 * (2)获取文件或目录的路径
 * getPath()
 * getAbsolutePath()
 * getCanonicalPath()
 * (3)创建、删除、重命名
 * createNewFile()：只能创建文件
 * mkdir()：只能创建一级目录
 * mkdirs()：创建多级目录
 * delete()：可以删除文件
 * 			可以删除空目录
 * renameTo(File dest)：可以给文件或目录重命名
 * (4)判断是文件还是目录
 * isDirectory()：是存在的一个文件夹，返回true
 * isFile()：是存在的一个文件，返回true
 * (5)不存在的一个文件或目录
 * 你获取它的name,path这些是有值，因为这些属性是通过构造器创建File时指定的。
 * 而其他的属性都是默认值。
 * 数组：length属性
 * String：length()
 * 文件：length()
 * */
public class Test01File {
	@Test
	public void test17(){
		File file = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记");
		System.out.println("文件夹的大小：" + file.length());
	}
		
	
	@Test
	public void test16(){
		File file = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记/xxxx");
		
		System.out.println("文件名：" + file.getName());
		System.out.println("文件大小：" + file.length() + "字节");
		System.out.println("文件是否是隐藏文件：" + file.isHidden());
		System.out.println("文件是否存在：" + file.exists());
		System.out.println("文件是否可读：" + file.canRead());
		System.out.println("文件是否可写：" + file.canWrite());
		
		String parent = file.getParent();//返回父目录的名称
		File dir = file.getParentFile();//返回父目录的File对象
		System.out.println("文件的父目录：" + parent);
		
		
		System.out.println("文件最后修改时间：" + file.lastModified()+"毫秒");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("文件最后修改时间：" + sf.format(new Date(file.lastModified())));
	}
	
	@Test
	public void test15(){
		File file = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记/xxxx");
		if(file.isDirectory()){
			System.out.println("是一个文件夹");
		}else if(file.isFile()){
			System.out.println("是一个文件");
		}else if(file.exists()){
			System.out.println("file对象对应的文件或目录存在");
		}else{
			System.out.println("根本不存在");
		}
	}
	
	@Test
	public void test14(){
		File file = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记/后续笔记");
		if(file.isDirectory()){
			System.out.println("是一个文件夹");
		}
	}
	
	@Test
	public void test13(){
		File file = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记/后续笔记/第14章 IO流.docx");
		if(file.isFile()){
			System.out.println("是一个文件");
		}
	}
	
	@Test
	public void test12() throws IOException{
		File file = new File("d:/IOTest");
		File dest = new File("d:/IOGUIGU");
		file.renameTo(dest);
	}
	
	
	@Test
	public void test11() throws IOException{
		File file = new File("d:/IOTest/java");
		file.delete();
	}
	
	@Test
	public void test10() throws IOException{
		File file = new File("d:/IOTest/java/atguigu");
		file.delete();
	}
	
	
	@Test
	public void test09() throws IOException{
		File file = new File("d:/1.txt");
		file.delete();
	}
	
	@Test
	public void test08() throws IOException{
		File file = new File("d:/IOTest/java/atguigu");
		if(!file.exists()){
			System.out.println("文件夹不存在，创建这个文件夹");
			file.mkdirs();
		}
	}
	
	
	@Test
	public void test07() throws IOException{
		File file = new File("d:/IOTest");
		if(!file.exists()){
			System.out.println("文件夹不存在，创建这个文件夹");
			file.mkdir();
		}
	}
	
	@Test
	public void test06() throws IOException{
		File file = new File("d:/1.txt");
		if(!file.exists()){
			System.out.println("文件不存在，创建这个文件");
			file.createNewFile();
		}
	}
	
	@Test
	public void test05() throws IOException{
		//非规范路径：带../或./或/
		File file = new File("../../02-尚硅谷JavaEE技术之SpringMVC.docx");
		System.out.println("文件的路径：" + file.getPath());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的规范路径：" + file.getCanonicalPath());//会自动解析：../等
	}
	
	@Test
	public void test04() throws IOException{
		//相对路径：相对当前的项目
		File file = new File("2019年10月份线下班尚硅谷SpringMVC框架最新视频/02-尚硅谷JavaEE技术之SpringMVC.docx");
		System.out.println("文件的路径：" + file.getPath());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的规范路径：" + file.getCanonicalPath());
	}
	
	@Test
	public void test03() throws IOException{
		//绝对路径：从根目录开始导航，就是绝对路径
		File file = new File("F:/2019年10月份线下班尚硅谷SpringMVC框架最新视频/02-尚硅谷JavaEE技术之SpringMVC.docx");
		System.out.println("文件的路径：" + file.getPath());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的规范路径：" + file.getCanonicalPath());
	}
	
	@Test
	public void test02(){
		File file = new File("F:/2019年10月份线下班尚硅谷SpringMVC框架最新视频/02-尚硅谷JavaEE技术之SpringMVC.docx");
		System.out.println("文件名：" + file.getName());
		System.out.println("文件大小：" + file.length() + "字节");
		System.out.println("文件是否是隐藏文件：" + file.isHidden());
		System.out.println("文件是否存在：" + file.exists());
		System.out.println("文件是否可读：" + file.canRead());
		System.out.println("文件是否可写：" + file.canWrite());
		
		String parent = file.getParent();//返回父目录的名称
		File dir = file.getParentFile();//返回父目录的File对象
		System.out.println("文件的父目录：" + parent);
		
		
		System.out.println("文件最后修改时间：" + file.lastModified()+"毫秒");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("文件最后修改时间：" + sf.format(new Date(file.lastModified())));
	}
	
	@Test
	public void test01(){
		File ioBJ1 = new File("F:\\2019年10月份线下班尚硅谷SpringMVC框架最新视频\\02-尚硅谷JavaEE技术之SpringMVC.docx");
		File ioBJ2 = new File("F:/2019年10月份线下班尚硅谷SpringMVC框架最新视频/02-尚硅谷JavaEE技术之SpringMVC.docx");
		File ioBJ3 = new File("F:" +"2019年10月份线下班尚硅谷SpringMVC框架最新视频" +File.separator+ "02-尚硅谷JavaEE技术之SpringMVC.docx");
	
		File dir1 = new File("F:/2019年10月份线下班尚硅谷SpringMVC框架最新视频/02-尚硅谷JavaEE技术之SpringMVC.docx");
	}
}
