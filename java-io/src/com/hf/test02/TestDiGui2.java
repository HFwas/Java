package com.hf.test02;

import org.junit.Test;

public class TestDiGui2 {
	/*
	 * 求阶乘
	 * 例如：5! = 5 * 4 * 3* 2 *1
	 * 求n！
	 */
	public int jieCheng(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}else {
			return n * jieCheng(n - 1);
		}
	}
	
	@Test
	public void test(){
		System.out.println(jieCheng(5));
	}
}
