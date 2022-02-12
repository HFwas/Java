package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo02
 * @version: 1.0
 */
public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("线程");
        thread.start();

        MyThread thread1 = new MyThread("线程1");
        thread1.start();
    }
}
