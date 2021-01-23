package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 栈上分配测试
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * @version: 1.0
 */
public class StackALLocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        //查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start) + "ms");
        //为了方便查看堆内存中对象个数，线程sleep
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void alloc() {
        //未发生逃逸
        User user = new User();
    }

    static class User{

    }
}

