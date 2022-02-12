package com.hfwas.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo02
 * 文件复制练习:一读一写
 *     明确:
 *         数据源: E:\czxt\Ghost\PE\\
 *         数据的目的地: d:\\1.jpg
 *
 *     文件复制的步骤:
 *         1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
 *         2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
 *         3.使用字节输入流对象中的方法read读取文件
 *         4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
 *         5.释放资源
 * @version: 1.0
 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("E:\\czxt\\Ghost\\PE\\1.jpg");
        //2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("E:\\czxt\\Ghost\\2.jpg");

        //开始时间
        long start = System.currentTimeMillis();

        byte[] bytes = new byte[1024];
        int length = 0;
        // 3.使用字节输入流对象中的方法read读取文件
        while ((length = fis.read(bytes)) != -1) {
            //写入
            //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,length);
        }

        //5.释放资源
        fos.close();
        fis.close();

        //结束时间
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
