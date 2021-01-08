package com.hfwas.demo04;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo04
 * 字符输出流写数据的其他方法
 *         - void write(char[] cbuf)写入字符数组。
 *         - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *         - void write(String str)写入字符串。
 *         - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 * @version: 1.0
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Java\\GitRep\\JavaSE\\day19\\d.txt");
        char[] chars = {'a','b','c','d','e'};
        //void write(char[] cbuf)写入字符数组。
        fw.write(chars);
        fw.flush();

        //void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        //bc
        fw.write(chars,1,2);
        fw.flush();

        //void write(String str)写入字符串。
        fw.write("der");
        fw.flush();

        //void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        //ert
        fw.write("qwert",2,3);
        fw.flush();

        //没有乱码
        fw.write("中国");
        fw.flush();

        fw.close();
    }
}
