package com.hfwas.demo03;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo03
 * 使用字节流读取中文文件
 *     1个中文
 *         GBK:占用两个字节
 *         UTF-8:占用3个字节
 * @version: 1.0
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\czxt\\Ghost\\PE\\b.txt");
        int length = 0;
        while ((length = fis.read()) != -1) {
            //如果是中文，转换称为char类型，会乱码
            System.out.println((char) length);
        }
        fis.close();
    }
}
