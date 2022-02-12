package com.hfwas.demo01;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo01
 * File类获取功能的方法
 *         - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 *         - public String getPath() ：将此File转换为路径名字符串。
 *         - public String getName()  ：返回由此File表示的文件或目录的名称。
 *         - public long length()  ：返回由此File表示的文件的长度。
 * @version: 1.0
 */
public class Demo03File {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        //public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        //返回
        File file = new File("D:\\file\\XiaoLi\\a.txt");
        String path = file.getAbsolutePath();
        //D:\file\XiaoLi\a.txt
        System.out.println(path);

        String path1 = file.getPath();
        //D:\file\XiaoLi\a.txt
        System.out.println(path1);

        String name = file.getName();
        //a.txt
        System.out.println(name);

        long length = file.length();
        //0
        System.out.println(length);
    }
}
