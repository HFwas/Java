package com.hfwas.java.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/20
 * @Description: com.hfwas.java.chapter02
 * @version: 1.0
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(systemClassLoader);

        //获取其上层：扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        //sun.misc.Launcher$ExtClassLoader@1b6d3586
        System.out.println(parent);

        //在获取其上层：启动类加载器
        ClassLoader parent1 = parent.getParent();
        //null
        System.out.println(parent1);

        //获取自定义加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader);

        //String类型使用引导类加载器进行加载-->java的核心类都使用引导类加载器进行加载
        ClassLoader classLoader1 = String.class.getClassLoader();
        //null
        System.out.println(classLoader1);
    }
}
