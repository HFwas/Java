package com.hf.test;
//同步方法
public class Test01 {
	public static void main(String[] args) {
		
	}
}

class Ticket implements Runnable{
	private int total = 1000;
	private static Object lock = new Object();
	@Override
	public void run() {
		while (true) {
				saleOneTicket();
		}
	}
	
	//同步方法，锁的是一次调用过程
	public synchronized void saleOneTicket(){
		if (total >0) {
			System.out.println(Thread.currentThread().getName() + "卖出一张票");
			total--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("剩余：" + total);
		}
	}
}
