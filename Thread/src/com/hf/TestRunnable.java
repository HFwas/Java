package com.hf;
//创建线程的第二种方式
//实现Runnable接口
public class TestRunnable {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		//Runnable没有start方法，需要借助Thread类的start方法：设计到设计模式中的代理模式
		Thread thread = new Thread(myRunnable);
		thread.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("main方法："+i);
		}
	}
}	

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("自定义线程："+ i );
		}
	}
	
}