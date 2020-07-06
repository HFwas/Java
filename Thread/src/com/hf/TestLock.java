package com.hf;

public class TestLock {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread1 myThread2 = new MyThread1();
		MyThread1 myThread3 = new MyThread1();
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
	}
}

class MyThread1 extends Thread{
	private static int total = 100;
	private static Object lock = new Object();//锁的选择之一，单独造一个锁
	@Override
	public void run() {
		while (true) {
			synchronized (lock) {
				if (total > 0) {
					System.out.println(Thread.currentThread().getName() + "卖出一张票");
					total--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("剩余："+total);
				}else {
					break;
				}
			}
		}
	}
	
}