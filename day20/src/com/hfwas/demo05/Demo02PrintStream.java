package com.hfwas.demo05;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo05
 * 可以改变输出语句的目的地(打印流的流向)
 *     输出语句,默认在控制台输出
 *     使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 *         static void setOut(PrintStream out)
 *           重新分配“标准”输出流。
 * @version: 1.0
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("aaaaa");

        PrintStream ps = new PrintStream("D:\\Java\\GitRep\\JavaSE\\day20\\p.txt");
        System.setOut(ps);
        System.out.println("dddddd");
        System.out.println();
        System.out.println(1545);

        ps.close();
    }
}
