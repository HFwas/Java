package com.hfwas.java.chapter15;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/26
 * @Description: com.hfwas.java.chapter15
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 * @version: 1.0
 */
public class HeapOOM {
    byte[] buffer = new byte[1024 * 1024 * 1];
    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Exception e) {
            System.out.println("count:" + count);
            e.printStackTrace();
        }
    }
}
