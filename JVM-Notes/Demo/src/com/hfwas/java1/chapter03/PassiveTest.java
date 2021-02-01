package com.hfwas.java1.chapter03;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * 类的被动使用
 * 
 *
 * 说明：没有初始化的类，不意味这没有加载
 * @version: 1.0
 */
public class PassiveTest {
    @Test
    public void tets01(){
        System.out.println(Child.num);
    }
}

class Parent{
    static {
        System.out.println("Father的初始化");
    }

    public static int num = 10;
}

class Child extends Parent{
    static {
        System.out.println("Child的初始化");
    }

}


