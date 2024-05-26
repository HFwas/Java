package com.hf.test02;

import org.junit.Test;

public class TestDiGui {
	/*
	 * 4.通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，
	 * 其中n是大于等于5并且小于10000的整数，例如：f(5) = 5 + 4 + 3 + 2 + 1，
	 * f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
	 * 请用递归的方式完成方法long f( int n)的方法体。
	 */
	public long f(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + f(n - 1);
		}
	}
	
	@Test
	public void test02(){
		System.out.println(f(5));
		System.out.println(f(10));
	}
}
