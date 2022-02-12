package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo03
 * 如果出现了重名现象，那么格式是，外部类名称.this.外部类成员变量名
 * @version: 1.0
 */
public class Outer {

    //外部类的成员变量
    int num = 10;

    public class Inner{

        //内部类的成员变量
        int num = 20;

        public void innerMethod(){
            //内部类方法的局部变量
            int num = 30;
            //局部变量，就近原则\
            //30
            System.out.println(num);
            //20
            System.out.println(this.num);
            //错误写法
//            System.out.println(super.num);

            //外部类的成员变量,10
            System.out.println(Outer.this.num);
        }
    }

}
