package com.hfwas.juc;

import java.util.ArrayList;

/**
 * @Auther: HFwas
 * @Date: 2020/12/2
 * @Description: 验证线程的原子性问题
 * @version: 1.0
 */
class TestAtomicity {
    //1.定义一个共享变量number
    private static int number = 0;
    public static void main(String[] args) throws InterruptedException {
        //2.对number进行1000次的++操作
        Runnable run = ()->{
            for (int i = 0; i < 1000; i++) {
                number++;
            }
        };

        ArrayList<Thread> list = new ArrayList<>();

        //3。使用5个线程来执行
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(run);
            thread.start();

            list.add(thread);
        }

        for (Thread thread : list) {
            thread.join();
        }

        System.out.println("number = "+number);
    }

}
