package com.hfwas.demo01;

import java.io.File;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo01
 * File类遍历(文件夹)目录功能
 *         - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
 *         - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 *
 *     注意:
 *         list方法和listFiles方法遍历的是构造方法中给出的目录
 *         如果构造方法中给出的目录的路径不存在,会抛出空指针异常
 *         如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 * @version: 1.0
 */
public class Demo06File {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        File file = new File("D:\\Java\\GitRep\\JavaSE\\day18");
        File[] files = file.listFiles();
        for (File file1 : files) {
            //打印的是详细的路径信息
            System.out.println(file1);
        }
    }

    /**
     * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
     */
    private static void demo01() {
        //遍历的是文件，而不是文件夹：NullPointerException
        //File file = new File("D:\\Java\\GitRep\\JavaSE\\day18\\1.txt");

        //文件夹不存在，文件路径错误：NullPointerException
        //File file = new File("D:\\Java\\GitRep\\JavaS\\da18");

        File file = new File("D:\\Java\\GitRep\\JavaSE\\day18");
        String[] list = file.list();
        for (String name : list) {
            System.out.println(name);
        }
    }
}
