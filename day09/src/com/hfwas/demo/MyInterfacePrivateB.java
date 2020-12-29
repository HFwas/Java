package com.hfwas.demo;

public interface MyInterfacePrivateB {

    /**
     * 默认方法
     */
    public static void method1(){
        System.out.println("静态方法1");
        methodCommon();
    }

    /**
     * 默认方法
     */
    public static void method2(){
        System.out.println("静态方法2");
        methodCommon();
    }

    /**
     * 抽取公共部分
     */
    private static void methodCommon(){
        System.out.println("ss");
        System.out.println("ssss");
        System.out.println("ssddd");
    }

}
