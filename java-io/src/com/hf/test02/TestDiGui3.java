package com.hf.test02;

import org.junit.Test;

public class TestDiGui3 {
	/*
	 * 6.第一个人10，第2个比第1个人大2岁，以此类推，请用递归方式计算出第8个人多大？
	 * 第一个人10,n=1, 结果10       
	 * 第二个人12，n=2, 结果10 + 2   	getAge(1) + 2
	 * 第三个人14，n=3, 结果10 + 2 + 2   getAge(2) + 2
	 * 
	 * 第n个人?，n=?, 结果10 + 2 + 2 ...+ ?  getAge(n-1) + 2
	 */
	@Test
	public void test(){
		System.out.println(age(3));
	}
	
	public int  age(int n) {
		if (n == 1) {
			return 10;
		}else {
			return 2 + age(n - 1); 
		}
	}
}
