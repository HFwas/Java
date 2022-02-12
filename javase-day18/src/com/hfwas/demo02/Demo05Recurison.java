package com.hfwas.demo02;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo02
 * 递归打印多级目录
 * 只要.txt结尾的文件
 * @version: 1.0
 */
public class Demo05Recurison {
    public static void main(String[] args) {
        File file = new File("E:\\czxt");
        print(file);
    }

    private static void print(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                print(file1);
            }else {
                String name = file1.getName();
                if (name.endsWith(".txt")) {
                    System.out.println(file1);
                }
            }
        }
    }
}
