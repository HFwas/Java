package com.hf.demo;

import java.io.File;

import org.junit.Test;

/*
 * 文件夹/目录它不同于文件，因为文件夹中可以放文件，或下一级文件夹。
 * (1)获取文件夹的下一级
 * String[] list();得到下一级文件或目录的名称
 * File[] listFiles()：得到下一级文件或目录的File对象
 * (2)求一个目录的总大小
 * (3)删除一个包含子目录，子文件的文件夹
 */
public class Test02Dir {
	@Test
	public void test04(){
		File dir = new File("F:/javaEE 19年10月毕业班");
		deleteDir(dir);
	}
	public void deleteDir(File file){
		//（1）如果是文件夹，先把它的下一级删除
		if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			//经过这个foreach循环，可以把file的所有的下一级删除
			for (File sub : listFiles) {
				deleteDir(sub);
			}
		}
		
		//文件夹就变成了空文件夹，就可以直接删
		//如果是文件也可以直接删除
		file.delete();
	}
	
	@Test
	public void test03(){
		File dir = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记");
		long size = getSize(dir);
		System.out.println(size);
	}
	
	public long getSize(File file){
		if(file.isFile()){
			return file.length();
		}else if(file.isDirectory()){
			long sum = 0;
			File[] listFiles = file.listFiles();
			for (File sub : listFiles) {
				sum += getSize(sub);//累加每一个下一级的大小
			}
			return sum;
		}
		return 0;
	}
	
	@Test
	public void test02(){
		File dir = new File("F:/javaEE 19年10月毕业班");
		listAllSub(dir);
	}
	
	//listAllSub()方法的功能是列出一个文件或一个目录及它的下一级
	public void listAllSub(File dir){
		if(dir.isDirectory()){//是文件夹的话
			File[] listFiles = dir.listFiles();
			for (File sub : listFiles) {//sub可能是一个文件，也可能是一个文件夹
				listAllSub(sub);//递归：自己调用自己
			}
		}
		System.out.println(dir);
	}
	
	
	@Test
	public void test01(){
		File dir = new File("D:/尚硅谷_190513班_柴林燕_JavaSE/笔记");
		
		String[] list = dir.list();
		for (String sub : list) {
			System.out.println(sub);
		}
	}
}

