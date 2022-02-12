package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class RunnableImple implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行了");
    }
}
