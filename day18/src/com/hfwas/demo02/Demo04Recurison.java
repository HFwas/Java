package com.hfwas.demo02;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo02
 * 递归打印多级目录
 * @version: 1.0
 */
public class Demo04Recurison {
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
                System.out.println(file1);
            }
        }
    }
}
