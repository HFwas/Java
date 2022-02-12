package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo03
 * 例如java.lang.Runnable接口就是一个函数式接口，
 *     假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行传参。
 *     这种情况其实和Thread类的构造方法参数为Runnable没有本质区别。
 * @version: 1.0
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了");
            }
        });

        //使用Lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "执行了");
        });

        //lambda简化版
        startThread(()-> System.out.println(Thread.currentThread().getName() + "执行了"));
    }

    private static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
