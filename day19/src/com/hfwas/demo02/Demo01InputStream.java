package com.hfwas.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo02
 * java.io.InputStream:字节输入流
 *     此抽象类是表示字节输入流的所有类的超类。
 *
 *     定义了所有子类共性的方法:
 *          int read()从输入流中读取数据的下一个字节。
 *          int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *          void close() 关闭此输入流并释放与该流关联的所有系统资源。
 *
 *     java.io.FileInputStream extends InputStream
 *     FileInputStream:文件字节输入流
 *     作用:把硬盘文件中的数据,读取到内存中使用
 *
 *     构造方法:
 *         FileInputStream(String name)
 *         FileInputStream(File file)
 *         参数:读取文件的数据源
 *             String name:文件的路径
 *             File file:文件
 *         构造方法的作用:
 *             1.会创建一个FileInputStream对象
 *             2.会把FileInputStream对象指定构造方法中要读取的文件
 *
 *     读取数据的原理(硬盘-->内存)
 *         java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 *
 *     字节输入流的使用步骤(重点):
 *         1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *         2.使用FileInputStream对象中的方法read,读取文件
 *         3.释放资源
 * @version: 1.0
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        //BCDE窘糆FCDabc
        FileInputStream fis = new FileInputStream("E:\\czxt\\Ghost\\PE\\b.txt");
        //2.使用FileInputStream对象中的方法read,读取文件
        //int read()读取文件中的一个字节并返回,读取到文件的末尾返回-1
        int read = fis.read();
        //66
        System.out.println(read);

        int length = 0;
        while ((length = fis.read()) != -1) {
            int read1 =  fis.read();
            //68 190 188 70 68 98 -1
            System.out.print(read1 + " ");
        }

        //3.释放资源
        fis.close();
    }
}
