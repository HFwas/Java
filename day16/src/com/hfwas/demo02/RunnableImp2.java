package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo02
 * @version: 1.0
 */
public class RunnableImp2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
        }
    }
}
