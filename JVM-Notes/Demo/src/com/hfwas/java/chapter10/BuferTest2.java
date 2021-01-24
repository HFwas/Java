package com.hfwas.java.chapter10;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter10
 * 本地内存的OOM:java.lang.OutOfMemoryError: Direct buffer memory
 * @version: 1.0
 */
public class BuferTest2 {
    // 20MB
    private static final int BUFFER = 1024 * 1024 * 20;

    public static void main(String[] args) {
        ArrayList<ByteBuffer> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
                list.add(byteBuffer);
                count++;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(count);
        }
    }
}
