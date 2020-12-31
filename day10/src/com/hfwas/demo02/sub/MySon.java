package com.hfwas.demo02.sub;

import com.hfwas.demo02.MyClass;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: 验证不同包子类的权限修饰符的作用范围
 * @version: 1.0
 */
public class MySon extends MyClass {

    public void methodSon(){
        System.out.println(super.num1);
        System.out.println(super.num2);
        //错误写法，不能访问默认修饰符的变量default
//        System.out.println(super.num3);

        //错误写法，不能访问private修饰的变量
//        System.out.println(super.num4);
    }

}
