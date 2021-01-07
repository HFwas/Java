package com.hfwas.demo01;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo01
 * File类判断功能的方法
 *         - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *         - public boolean isDirectory() ：此File表示的是否为目录。
 *         - public boolean isFile() ：此File表示的是否为文件。
 * @version: 1.0
 */
public class Demo04File {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    /**
     * public boolean isDirectory() ：此File表示的是否为目录。
     *             用于判断构造方法中给定的路径是否以文件夹结尾
     *                 是:true
     *                 否:false
     *         public boolean isFile() ：此File表示的是否为文件。
     *             用于判断构造方法中给定的路径是否以文件结尾
     *                 是:true
     *                 否:false
     *         注意:
     *             电脑的硬盘中只有文件/文件夹,两个方法是互斥
     *             这两个方法使用前提,路径必须是存在的,否则都返回false
     */
    private static void demo02() {
        File file = new File("D:\\Bandzip\\icons\\defaul");
        //不存在，两个方法都返回false
        System.out.println(file.isDirectory());
        //false
        System.out.println(file.isFile());

        File file2 = new File("D:\\Bandzip\\icons\\default\\001.ico");
        //true
        System.out.println(file2.isFile());
        //false
        System.out.println(file2.isDirectory());
        File file1 = new File("D:\\Bandzip\\icons\\default");
        //false
        System.out.println(file1.isFile());
        //true
        System.out.println(file1.isDirectory());
    }

    /**
     * public boolean exists() ：此File表示的文件或目录是否实际存在。
     *         用于判断构造方法中的路径是否存在
     *             存在:true
     *             不存在:false
     */
    private static void demo01() {
        File file = new File("D:\\Bandzip\\icons\\default\\001.ico");
        File file2 = new File("D:\\Bandzip\\icons\\default");
        boolean exists = file.exists();
        //true，判断文件是否存在
        System.out.println(exists);
        //true,判断文件是否存在
        System.out.println(file2.exists());

        //File file1 = new File("day18.impl");
        //System.out.println(file1.exists());
    }
}
