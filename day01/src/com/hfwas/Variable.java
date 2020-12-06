package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/6
 * @Description: 变量
 * @version: 1.0
 */
public class Variable {
    /*
        变量：程序运行期间，内容可以变化的值
            创建一个变量并且使用的格式：
                数据类型 变量名;//创建了一个变量
                变量名 = 数据值;//赋值
                数据类型 变量名 = 数据值;//在创建一个变量的同时并且赋值
         注意事项：
            1.如果创建多个变量，那么变量之间的名称不可重复
            2.对于float和long类型的值不能丢失F和L
            3.如果使用byte和short类型的变量，那么右侧数据值不能超过左侧数据类型的范围
            4.没有赋值的变量不能直接使用
            5.变量的使用不能超过使用范围
                【作用域】:从定义变量的一行开始，一直到直接所属的大括号结束为止
            6.可以通过一个语句创建多个变量，但是不推荐使用
     */
    public static void main(String[] args) {

        int z = 10,b = 20,c = 30;
        System.out.println("a= " + z + " b= " + b + " c= " + c);

        {
            int num = 99;
            System.out.println(num);
        }
        //System.out.println(num);//超过了使用范围

        int a = 10;
        //int a = 99;
        System.out.println(a);

        int num;
        num = 9;
        System.out.println(num);

        byte num2 = 40;//注意：右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num2);
        //byte num3 = 200;//-127~127，会报错
        //System.out.println(num3);

        short sh = 8;
        System.out.println(sh);//8

        //long l = 89000000;//
        long l = 89000000L;//要加后缀L
        System.out.println(l);//89000000

        float f = 8.4F;//要加后缀F
        System.out.println(f);//8.4

        char ch = 'A';
        System.out.println(ch);//A

        boolean boo = false;
        System.out.println(boo);//false

        //赋值
        boolean var = boo;
        System.out.println(var);//false
    }

}
