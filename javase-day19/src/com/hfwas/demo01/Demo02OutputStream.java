package com.hfwas.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo01
 * 一次写多个字节的方法:
 *         - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
 *         - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 *
 * public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
 *             一次写多个字节:
 *                 如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
 *                 如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
 * @version: 1.0
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("E:\\czxt\\Ghost\\PE\\b.txt"));
        byte[] bytes = {66,67,68,69};
        //BCDE
        fos.write(bytes);

        byte[] bytes1 = {-66,-67,-68,69,70};
        //窘糆F
        fos.write(bytes1);

        //CD
        fos.write(bytes,1,2);

        String s = new String("abc");
        byte[] bytes2 = s.getBytes();
        //[97, 98, 99]
        System.out.println(Arrays.toString(bytes2));
        //abc
        fos.write(bytes2);
        fos.close();
    }
}
