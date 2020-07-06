package com.hf;

public class TestLockRunnable {
	public static void main(String[] args) {
		MyRunnable1 myRunnable1 = new MyRunnable1();
		Thread thread1 = new Thread(myRunnable1);
		Thread thread2 = new Thread(myRunnable1);
		Thread thread3 = new Thread(myRunnable1);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyRunnable1 implements Runnable{
	private int total = 1000;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {//选择this当锁可以。因为只有一个MyRunnable1的对象
				if (total >0) {
					System.out.println(Thread.currentThread().getName() + "卖出一张票");
					total--;
					System.out.println("剩余：" + total);
				}else {
					break;
				}
			}
		}
	}
}
