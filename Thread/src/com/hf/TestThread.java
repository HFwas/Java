package com.hf;

/*
 *线程的两种实现方式
 *(1)继承Thread类
 *	1.创建线程类
 *	2.
 *(2)实现Runnable借口 
 */
public class TestThread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		//myThread.run();//这样就不是开启多线程了，而是直接调用方法
		myThread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("main方法："+i);
		}
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("自定义线程："+i);
		}
	}
	
}

