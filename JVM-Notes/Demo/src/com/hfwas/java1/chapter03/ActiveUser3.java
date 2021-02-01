package com.hfwas.java1.chapter03;

import org.junit.Test;

import java.util.Random;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * @version: 1.0
 */
public class ActiveUser3 {
    //当使用java.lang.reflect包中的方法反射类的方法时。比如：Class. forName（"' com.atguigu.java.Test"）
    @Test
    public void tets01(){
        try {
            Class aClass = Class.forName("com.hfwas.java1.chapter03.Order");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //当初始化子类时，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化
    @Test
    public void test02(){
        System.out.println(Son.num);
    }

    @Test
    public void test03(){
        System.out.println(CompareC.NUM_C);
    }

    @Test
    public void test04(){
        System.out.println(CompareC.NUM_C);
    }
}

class Father{
    static {
        System.out.println("Father类的初始化");
    }
}

class Son extends Father implements CompareB{
    static {
        System.out.println("Son类的初始化");
    }
    public static int num = 10;
}

interface CompareB{
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareB 的初始化");
        }
    };

    public default void method(){
        System.out.println("你好");
    }
}

interface CompareC extends CompareB{
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareC 的初始化");
        }
    };

    public static final int NUM_C = new Random().nextInt(10);
}