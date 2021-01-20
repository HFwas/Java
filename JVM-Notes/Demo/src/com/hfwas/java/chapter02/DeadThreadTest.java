package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程开始了");
                DeadThread deadThread = new DeadThread();
                System.out.println(Thread.currentThread().getName() + "线程结束了了");
            }
        };
        Thread t1 = new Thread(runnable,"线程1");
        Thread t2 = new Thread(runnable,"线程2");
        t1.start();
        t2.start();
    }
}

class DeadThread{
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while (true) {

            }
        }
    }
}
