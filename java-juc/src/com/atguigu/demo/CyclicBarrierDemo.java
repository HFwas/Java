package com.atguigu.demo;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	//public CyclicBarrier(int parties,Runnable barrierAction)
	//创建一个新的 CyclicBarrier ，当给定数量的线程（线程）正在等待时，它将跳闸，当屏障跳闸时执行给定的屏障动作，由最后一个进入屏障的线程执行。 
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(7,()->{
            System.out.println("*****召唤神龙");
        });
        for (int i = 1; i <=7 ; i++) {
            final int tempInt=i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+
                        "\t 收集到第"+tempInt+"颗龙珠");
                try{
                    cyclicBarrier.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
    }
}
