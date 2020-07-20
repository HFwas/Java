package com.hf.test02;

import org.junit.Test;

public class TestDiGui4 {
	/**
	 *7.有n步台阶，一次只能上1步或2步，共有多少种走法？
	 * n==1  1
	 * n==2  2  
	 * n==3  最后一步  要么从第1级跨2步，要么从第2级跨1步		把走到第1级的走法 + 走到第2级的走法  sum(1) + sum(2)
	 * n==4 最后一步  要么从第2级跨2步，要么从第3级跨1步		把走到第2级的走法 + 走到第3级的走法  sum(2) + sum(3)
	 * n==5 最后一步  要么从第3级跨2步，要么从第4级跨1步		把走到第3级的走法 + 走到第4级的走法  sum(3) + sum(4)
	 * n=? 最后一步  要么从第n-2级跨2步，要么从第n-1级跨1步		把走到第n-2级的走法 + 走到第n-1级的走法  sum(n-2) + sum(n-1)
	 */
	@Test
	public void test(){
		System.out.println(sum(5));
	}
	public int sum(int n) {
		if (n == 1 || n == 2) {
			return n;
		}else {
			return sum(n - 1) + sum(n - 2);
		}
		
	}
}
