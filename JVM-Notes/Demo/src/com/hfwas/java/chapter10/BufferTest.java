package com.hfwas.java.chapter10;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter10
 * 查看直接内存的占用与释放
 * IO                   NIO(no io/non-blocking io)
 * byte[]/char[]        Buffer
 * Stream               Channel
 *
 * @version: 1.0
 */
public class BufferTest {
    // 1G
    private static final int BUFFER = 1024 * 1024 * 1024;

    public static void main(String[] args) {
        //直接分配本地内存空间
        ByteBuffer buffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接内存分配完毕");

        Scanner sc = new Scanner(System.in);
        sc.next();

        System.out.println("直接内存开始释放");
        buffer = null;
        System.gc();
        sc.next();
    }
}
