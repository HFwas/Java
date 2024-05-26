package com.hfwas.juc;

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 验证线程的可见性问题
 * @version: 1.0
 */
public class TestVisiblity {
    //1.创建一个静态变量
    private static  boolean flag = true;

    public static void main(String[] args) {
        //2.创建一个线程不断读取共享变量
        new Thread(()->{
            while (flag){

            }
        }).start();

        //3.创建一个线程修改变量的值
        new Thread(()->{
            flag = false;
            System.out.println("线程已经修改了变量的值");
        }).start();

    }

}
