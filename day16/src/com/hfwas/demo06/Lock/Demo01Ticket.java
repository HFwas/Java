package com.hfwas.demo06.Lock;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo04
 * @version: 1.0
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        //三个 同时买票
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
