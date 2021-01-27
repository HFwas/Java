package com.hfwas.java.chapter16;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/27
 * @Description: com.hfwas.java.chapter16
 * 演示 Stop The World
 * @version: 1.0
 */
public class StopTheWorldTest {
    public static class workThread extends Thread {
        ArrayList<byte[]>  list = new ArrayList<byte[]>();

        public void run() {
            try {
                while (true) {
                    for (int i = 0; i < 1000; i++) {
                        byte[] bytes = new byte[1024];
                        list.add(bytes);
                    }
                    if (list.size() > 10000) {
                        list.clear();
                        System.gc();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class PrintThread extends Thread{
        public final long startTime = System.currentTimeMillis();

        public void run() {
            try {
                while (true) {
                    // 每秒打印时间
                    long end = System.currentTimeMillis() - startTime;
                    System.out.println(end / 1000 + "." + end % 1000);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PrintThread t1 = new PrintThread();
        workThread t2 = new workThread();
        t1.start();
        t2.start();
    }
}
