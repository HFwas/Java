package com.hfwas.java1.chapter03;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * @version: 1.0
 */
public class StaticDeadLockMain extends Thread{
    private char flag;

    public StaticDeadLockMain(char flag){
        this.flag = flag;
        this.setName("Thread:" + flag);
    }

    @Override
    public void run() {
        super.run();
    }
}

class StaticB{
    static {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.hfwas.java1.chapter03.StaticA");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Static init OK");
    }
}

class StaticA{
    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("com.hfwas.java1.chapter03.StaticB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Static init OK");
    }
}
