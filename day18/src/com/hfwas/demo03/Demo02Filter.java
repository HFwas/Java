package com.hfwas.demo03;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("E:\\czxt");
        print(file);
    }

    private static void print(File file) {
        //传递过滤器实现类对象
        File[] files = file.listFiles(new FileFilter() {
            //过滤规则
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".txt");
            }
        });
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
