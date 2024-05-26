package com.hfwas.juc.

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 验证synchronized的不可中断特性
 * 1.定义一个Runnable
 * 2.在Runnable中定义同步代码块
 * 3.先开启一个线程来执行同步代码块，保证不退出同步代码块
 * 4.后开启一个线程来执行同步代码块(阻塞状态)
 * 5.停止第二个线程
 * @version: 1.0
 */
public class UnInterruptible {

    private  static  Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        //1.定义一个Runnable
        Runnable runnable = ()->{
            //2。定义一个同步代码块
            synchronized (obj){
                String name = Thread.currentThread().getName();
                System.out.println(name + "进入了同步代码块");
                try {
                    Thread.sleep(13000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //3.开启一个线程，先执行
        Thread t1 = new Thread(runnable);
        t1.start();
        Thread.sleep(3000);
        //4.后开启一个线程在执行
        Thread t2 = new Thread(runnable);
        t2.start();


        System.out.println("停止线程前");
        t2.interrupt();
        System.out.println("停止线程后");

        //查看线程1和线程2的状态
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

}
