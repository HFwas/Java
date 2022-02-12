package com.hfwas.demo03;

import java.io.*;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo03
 * java.io.OutputStreamWriter extends Writer
 *     OutputStreamWriter: 是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。(编码:把能看懂的变成看不懂)
 *
 *     继续自父类的共性成员方法:
 *         - void write(int c) 写入单个字符。
 *         - void write(char[] cbuf)写入字符数组。
 *         - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *         - void write(String str)写入字符串。
 *         - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *         - void flush()刷新该流的缓冲。
 *         - void close() 关闭此流，但要先刷新它。
 *     构造方法:
 *         OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。
 *         OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
 *         参数:
 *             OutputStream out:字节输出流,可以用来写转换之后的字节到文件中
 *             String charsetName:指定的编码表名称,不区分大小写,可以是utf-8/UTF-8,gbk/GBK,...不指定默认使用UTF-8
 *     使用步骤:
 *         1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
 *         2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
 *         3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
 *         4.释放资源
 * @version: 1.0
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //demo01();
        demo02();
    }

    /**
     * 使用转换流OutputStreamWriter写GBK格式的文件
     */
    private static void demo02() throws IOException {
        //1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
        //不指定编码格式，就是按照当前项目规定的编码格式
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day20\\gbk2.txt"),"gbk");
        //2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        //4.释放资源
        osw.close();
    }

    /**
     * 使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void demo01() throws IOException {
        //1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
        //不指定编码格式，就是按照当前项目规定的编码格式
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day20\\utf8.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day20\\utf8.txt"),"utf-8");
        //2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
        osw.flush();
        //4.释放资源
        osw.close();
    }
}
