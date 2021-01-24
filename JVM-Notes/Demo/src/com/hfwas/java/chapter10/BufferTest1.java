package com.hfwas.java.chapter10;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: HFwas
 * @Date: 2021/1/24
 * @Description: com.hfwas.java.chapter10
 * @version: 1.0
 */
public class BufferTest1 {
    private static final String TO = "E:\\电影\\82年生的金智英.1080p.HD中字.mp4";
    private static final int _100MB = 1024 * 1024 * 100;

    public static void main(String[] args) {
        long sum = 0;
        String src = "E:\\电影\\82年生的金智英.1080p.HD中字.mp4";
        for (int i = 0; i < 3; i++) {
            String dest = "E:\\电影\\82年生的金智英.1080p.HD中字"+ i +".mp4";
            //总花费的时间：180908
            //sum += io(src,dest);

            //总花费的时间：157009
            sum += directBuffer(src,dest);
        }

        System.out.println("总花费的时间：" + sum);
    }

    private static long io(String src, String dest) {
        long start = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            byte[] bytes = new byte[_100MB];
            int length = 0;
            while ((length = fis.read(bytes)) != -1) {
                fos.write(bytes,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long directBuffer(String src, String dest) {
        long start = System.currentTimeMillis();

        FileChannel inChannel = null;
        FileChannel outChannel = null;

        try {
            inChannel = new FileInputStream(src).getChannel();
            outChannel = new FileOutputStream(dest).getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100MB);
            while (inChannel.read(byteBuffer) != -1) {
                //修改为读数据模式
                byteBuffer.flip();
                outChannel.write(byteBuffer);
                //清空
                byteBuffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (outChannel != null) {
                try {
                    outChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
