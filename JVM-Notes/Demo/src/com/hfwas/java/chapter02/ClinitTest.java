package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class ClinitTest {
    //任何一个类声明之后，内部至少存在一个类的构造器
    private int a = 1;
    private static int c = 2;

    public ClinitTest(){
        a = 10;
        int d = 30;
    }

    public static void main(String[] args) {
        int b = 3;
        //System.out.println(b);
    }
}
