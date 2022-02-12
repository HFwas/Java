package com.hfwas.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo01
 * File类创建删除功能的方法
 *         - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *         - public boolean delete() ：删除由此File表示的文件或目录。
 *         - public boolean mkdir() ：创建由此File表示的目录。
 *         - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 * @version: 1.0
 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * public boolean delete() ：删除由此File表示的文件或目录。
     *         此方法,可以删除构造方法路径中给出的文件/文件夹
     *         返回值:布尔值
     *             true:文件/文件夹删除成功,返回true
     *             false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
     *         注意:
     *             delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
    private static void demo03() {
        File file = new File("D:\\Java\\GitRp\\JavSE\\day18\\1\\2");
        System.out.println(file.delete());
    }

    /**
     * public boolean mkdir() ：创建单级空文件夹
     *        public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
     *        创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
     *         返回值:布尔值
     *             true:文件夹不存在,创建文件夹,返回true
     *             false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
     *         注意:
     *             1.此方法只能创建文件夹,不能创建文件
     */
    private static void demo02() {
        File file = new File("D:\\Java\\GitRep\\JavaSE\\day18\\aa");
        System.out.println(file.mkdir());

        File file1 = new File("D:\\Java\\GitRep\\JavaSE\\day18\\11\\22\\12");
        System.out.println(file1.mkdirs());

        //会创建文件夹，路径不存在
        File file2 = new File("D:\\Java\\GitRp\\JavSE\\day18\\1\\2");
        System.out.println(file2.mkdirs());


    }

    /**
     * public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     *         创建文件的路径和名称在构造方法中给出(构造方法的参数)
     *         返回值:布尔值
     *             true:文件不存在,创建文件,返回true
     *             false:文件存在,不会创建,返回false
     *         注意:
     *             1.此方法只能创建文件,不能创建文件夹
     *             2.创建文件的路径必须存在,否则会抛出异常
     *
     *         public boolean createNewFile() throws IOException
     *         createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */
    private static void demo01() throws IOException {
        File file = new File("D:\\Java\\GitRep\\JavaSE\\day18\\1.txt");
        boolean b = false;
        try {
            b = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b);

        File file1 = new File("day18\\2.txt");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("dy18\\1");
        //IOException: 系统找不到指定的路径。
        System.out.println(file2.createNewFile());
    }
}
