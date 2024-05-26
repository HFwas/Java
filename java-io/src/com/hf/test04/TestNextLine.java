package com.hf.test04;

import java.util.Scanner;

/*
 * Scanner：
 * （1）next()：遇到空白符就认为输入结束
 * （2）nextLine()：遇到换行符认为输入结束
 */
public class TestNextLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		String str = input.nextLine();
//		String str = input.next();
//		System.out.println(str);
		
		System.out.print("请输入整数：");
		int num = input.nextInt();
		System.out.print("请输入小数：");
		double d = input.nextDouble();
		input.nextLine();
		System.out.print("请输入字符串：");
		String str = input.nextLine();//读取上一个输入流中的换行符
//		String str = input.next();
		
		System.out.println(num);
		System.out.println(d);
		System.out.println(str);
	}
}

