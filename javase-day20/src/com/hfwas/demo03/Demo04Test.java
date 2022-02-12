package com.hfwas.demo03;

import java.io.*;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo03
 * 练习：转换文件编码
 *         将GBK编码的文本文件，转换为UTF-8编码的文本文件。
 *
 *     分析:
 *         1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
 *         2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
 *         3.使用InputStreamReader对象中的方法read读取文件
 *         4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中
 *         5.释放资源
 * @version: 1.0
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Java\\GitRep\\JavaSE\\day20\\gbk2.txt"), "gbk");
        //2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day20\\utf8_2.txt"), "UTF-8");
        //3.使用InputStreamReader对象中的方法read读取文件
        int length = 0;
        while ((length = isr.read()) != -1) {
            osr.write(length);
        }
        //5.释放资源
        osr.close();
        isr.close();
    }
}
