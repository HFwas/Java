package com.hfwas.demo04;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo04
 * @version: 1.0
 */
public class Demo01Printable {
    public static void main(String[] args) {
        printString((string)->{
            System.out.println(string);
        });
    }

    private static void printString(Printable printable) {
        printable.print("你好");
    }


}
