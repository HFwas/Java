package com.hfwas.demo05;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Demo02ThreadSafe {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        //com.hfwas.demo05.RunnableImpl@1b6d3586
        System.out.println(runnable);
        //三个 同时买票
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
