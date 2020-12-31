package com.hfwas.demo02.sub;

import com.hfwas.demo02.MyClass;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: 验证不同包非子类的权限修饰符的作用范围
 * @version: 1.0
 */
public class MyStranger {

    public void methodStranger(){
        MyClass aClass = new MyClass();
        System.out.println(aClass.num1);
        //错误写法，不能访问protected修饰的变量
//        System.out.println(aClass.num2);

        //错误写法，不能访问default修饰的变量
//        System.out.println(aClass.num3);

        //错误写法，不能访问private修饰的变量
//        System.out.println(aClass.num4);
    }

}
