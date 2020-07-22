package com.hf.test08;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.junit.Test;

/*
 * io:
 * 	阻塞式IO
 * nio:  JDK1.4-->JDK1.7
 * 	 非阻塞式的IO
 * Path（接口）：类似于File，用路径名表示一个目录或文件
 * Paths：工具类,用来创建Path接口的对象
 * Files工具类，操作文件或目录的工具类:
 * (1)Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
 * (2)delete(Path path)       功能类似于File类的delete()	
 * 							不同的地方是会报异常，当文件不存在时
 *    deleteIfExists(Path path) 功能相同于File类的delete()	存在就删除，不存在就什么也不干
 * (3)move(Path source, Path target, CopyOption... options)   相当于剪切
 * (4)List<String> readAllLines(Path path, Charset cs)  
 * ...
 */
public class TestNIO {
	@Test
	public void test06() throws IOException{
		Path file = Paths.get("testIO","java","2.txt");
		List<String> allLines = Files.readAllLines(file, Charset.forName("UTF-8"));
		for (String string : allLines) {
			System.out.println(string);
		}
	}
	
	@Test
	public void test05() throws IOException{
		Path src = Paths.get("2.txt");
		Path dest = Paths.get("testIO","java","2.txt");//文件夹的层级分类，testIO一级分类
		Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
	}
	
	
	@Test
	public void test04() throws IOException{
		File file = new File("1.txt");
		file.delete();
	}
	
	@Test
	public void test03() throws IOException{
		Path src = Paths.get("1.txt");
		Files.delete(src);
	}
	
	@Test
	public void test02() throws IOException{
		Path src = Paths.get("1.txt");
		Path dest = Paths.get("2.txt");
		Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
	}
	
	@Test
	public void test01(){
		Path file = Paths.get("testIO", "java" ,"1.txt");
		
		int count = file.getNameCount();
		System.out.println(count);
		
		Path name = file.getName(0);
		System.out.println(name);
	}
}
