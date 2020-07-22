package com.hf.test08;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Test;

/*
 * 在Java层面是常量对象，但是可以同C等底层语言进行修改
 * System.in：
 * System.out
 * System.err
 */
public class TestSystem {
	@Test
	public void test02() throws FileNotFoundException{
		System.setOut(new PrintStream("1.txt"));
		
		System.out.println("aaaa");
		System.out.println("bbb");
		System.out.println("ccc");
		System.out.println("ddd");
	}
	
	@Test
	public void test01(){
		PrintStream out = System.out;
		System.out.println(out);
	}
}
