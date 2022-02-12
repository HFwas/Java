package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/5
 * @Description: com.hfwas.demo01
 * 获取线程的名称:
 *         1.使用Thread类中的方法getName()
 *             String getName() 返回该线程的名称。
 *         2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
 *             static Thread currentThread() 返回对当前正在执行的线程对象的引用
 * @version: 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        //线程名字
        //String name = getName();
        //System.out.println(name);

        Thread thread = Thread.currentThread();
        //Thread[Thread-0,5,main]
        System.out.println(thread);

        String name = thread.getName();
        //Thread-0
        System.out.println(name);

        System.out.println(Thread.currentThread().getName());
    }
}
