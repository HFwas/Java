package com.hfwas.java.chapter08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * -Xms600m -Xmx600m
 * @version: 1.0
 */
public class HeapInstanceTest {
    byte[] byffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
