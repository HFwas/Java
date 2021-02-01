package com.hfwas.java1.chapter03;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/2/1
 * @Description: com.hfwas.java1.chapter03
 * @version: 1.0
 */
public class ActiveUser2 {
    @Test
    public void test01(){
        System.out.println(User.num);

    }
}

class User{
    static {
        System.out.println("User 类的的初始化");
    }

    public static int num = 10;
}
