package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Demo01Runnable{
    public static void main(String[] args) {
        RunnableImple ru = new RunnableImple();
        Thread thread = new Thread(ru);
        thread.start();

        //简化代码，使用匿名内部类
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程执行了" );
            }
        };
        new Thread(runnable).start();

        //继续简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程执行了");
            }
        }).start();
    }
}
