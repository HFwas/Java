package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/8
 * @Description: 方法重载重写
 * @version: 1.0
 */
public class MethodOverload {
    /*
        方法的重载：多个方法名相同，但是参数列表不同
        影响因素：有关
            1.参数个数不同
            2.参数类型不同
            3.参数的多类型顺序不同
            无关：
                1.与方法的返回值类型无关
                2.与参数的名称无关
     */
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));

        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));

        System.out.println(isSame((short) 10,(short) 20));

        System.out.println(isSame(10,10));
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static int sum(int a,double b){
        return (int) (a + b);
    }

    public static int sum(double a,int b){
        return (int)(a + b);
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    public static int sum(int a,int b,int c,int d){
        return a + b + d + c;
    }

    //比较两个数据是否相等，两个byte,两个short类型,两个int类型,两个long类型
    public static boolean isSame(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }

    public static boolean isSame(short a, short b){
        System.out.println("short");
        return a == b;
    }

    public static boolean isSame(int a, int b){
        System.out.println("int");
        return a == b;
    }

    public static boolean isSame(long a, long b){
        System.out.println("long");
        return a == b;
    }

}
