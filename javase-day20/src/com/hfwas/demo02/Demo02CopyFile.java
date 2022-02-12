package com.hfwas.demo02;

import java.io.*;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo02
 * 文件的大小:730,309 字节
 *       一次读写一个字节:40毫秒
        使用数组缓冲读取多个字节,写入多个字节:2毫秒
 *
 * @version: 1.0
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\czxt\\Ghost\\PE\\1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\czxt\\Ghost\\2.jpg"));

        long begin = System.currentTimeMillis();

        //一次只读一个字节
        int length = 0;
        /*while ((length = bis.read()) != -1) {
            bos.write(length);
        }*/

        byte[] bytes = new byte[1024];
        while ((length = bis.read(bytes)) != -1) {
            bos.write(bytes,0,length);
        }

        bos.close();
        bis.close();

        System.out.println(System.currentTimeMillis() - begin);
    }
}
