package com.hfwas.demo01;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo01
 *  练习:
 *         对文本的内容进行排序
 *         按照(1,2,3....)顺序排序
 *     分析:
 *         1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
 *         2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
 *         3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
 *         4.使用字符缓冲输入流中的方法readline,逐行读取文本
 *         5.对读取到的文本进行切割,获取行中的序号和文本内容
 *         6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
 *         7.遍历HashMap集合,获取每一个键值对
 *         8.把每一个键值对,拼接为一个文本行
 *         9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
 *         10.释放资源
 * @version: 1.0
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        //1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
        HashMap<String, String> map = new HashMap<>();
        //2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\GitRep\\JavaSE\\day20\\1.txt"));
        //3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\GitRep\\JavaSE\\day20\\2.txt"));
        //4.使用字符缓冲输入流中的方法readline,逐行读取文本
        String str;
        while ((str = br.readLine()) != null) {
            //5.对读取到的文本进行切割,获取行中的序号和文本内容
            String[] split = str.split("\\.");
            //6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
            map.put(split[0],split[1]);
        }

        //7.遍历HashMap集合,获取每一个键值对
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            //8.把每一个键值对,拼接为一个文本行
            String l = key + "." + value;
            //9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
            bw.write(l);
            bw.newLine();
        }

        //10.释放资源
        bw.close();
        br.close();
    }
}
