package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/8
 * @Description: 方法
 * @version: 1.0
 */
public class Method {
    /*
        方法：其实是若干语句的功能集合
            定义：
                修饰符 返回值类型 方法名(参数类型 参数名, ....){
                    方法体;
                    return 返回值;
                }
            三种调用方式：
                1.单独调用：方法名称(参数);
                2.打印调用： System.out.println(add(2,3));//5
                3.赋值调用：数据类型 变量名 = 方法名称(参数);
            方法有参与无参：
                有参：小括号当中有内容。方法需要一些数据才能完成
                无参：小括号当中留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数
            有返回值和无返回值：
                注意事项：
                    对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用
                    但是对于无返回值的方法，只能使用的那杜调用，不能使用打印调用或者赋值调用
          注意事项：
            1.方法应该定义再类当中，但是不能再方法当中再定义方法。不能嵌套
            2.方法定义的前后顺序无所谓
            3.方法定义之后不会执行，如果希望执行，一定要调用，
            4.如果方法有返回值，那么必须写上"return 返回值",不能没有
            5.return后买你的返回值数据，必须和方法的返回值类型，对应起来
            6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
            7.对于void方法当中最后一行的return可以省略不写
            8.一个方法当中可以有多个return语句，但是必须保证同时只有一个会被执行到
     */
    public static void main(String[] args) {
        printMethod();
        //单独调用
        add(1,2);//正确写法，但是返回值没有使用
//        System.out.println(getSum(12,12));//错误写法
        //打印调用
        System.out.println(add(2,3));//5
        //赋值调用
        int result = add(10,20);
        System.out.println("数量的值：" + result);

        getSum(10,20);
    }

    //两个数字相乘
    public static void method1(int a,int b){
        int result = a * b;
        System.out.println(result);
    }

    //有返回值和无返回值
    //求两个数字相加，有返回值
    public static int add(int a,int b) {
        //定义两个Int数字相加的方法
        return a + b;
    }

    //打印两个数字之和,无返回值
    public static void getSum(int a,int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void printMethod() {
        //输出一个长方形
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //注意事项7
    public static void pring(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        //return;//可以省略
    }

    //注意事项8
    public static int getMax(int a,int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

}
