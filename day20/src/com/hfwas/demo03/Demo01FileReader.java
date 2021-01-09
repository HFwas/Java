package com.hfwas.demo03;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo03
 * FileReader可以读取IDE默认编码格式(UTF-8)的文件
 *     FileReader读取系统默认编码(中文GBK)会产生乱码���
 * @version: 1.0
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java\\GitRep\\JavaSE\\day20\\gbk.txt");
        int length = 0;
        while ((length = fr.read()) != -1) {
            System.out.println((char) length);
        }
        fr.close();
    }
}
