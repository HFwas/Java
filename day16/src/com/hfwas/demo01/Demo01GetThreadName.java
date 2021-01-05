package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo01
 * @version: 1.0
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        new MyThread().start();
        new MyThread().start();
    }
}
