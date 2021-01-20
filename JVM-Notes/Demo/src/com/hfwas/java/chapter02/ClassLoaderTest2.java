package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            //1.获取当前类的ClassLoader
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.获取当前线程上下文的ClassLoader
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.获取当前系统的ClassLoader
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
