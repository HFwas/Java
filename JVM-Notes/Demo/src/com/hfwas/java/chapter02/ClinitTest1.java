package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class ClinitTest1 {
    static class Father{
        public static int anInt = 1;
        static {
            anInt = 10;
        }
    }

    static class Son extends Father{
        public static int bInt = anInt;
    }

    public static void main(String[] args) {
        //先加载Fatherl类，在加载Son子类
        //10
        System.out.println(Son.bInt);
    }
}
