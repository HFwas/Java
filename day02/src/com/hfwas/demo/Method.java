package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/7
 * @Description: 方法入门
 * @version: 1.0
 */
public class Method {
    /*
        方法：
            定义：
            注意事项：
                1.方法的定义的先后顺序无所谓
                2.方法的定义不能产生嵌套包含关系
                3.方法定义好之后不会执行，如果要想执行，需要先调用
     */
    public static void main(String[] args) {
        farmer();
        seller();
        me();
    }

    public static void me() {
        System.out.println("吃");
    }

    public static void seller() {
        System.out.println("叫价");
        System.out.println("抬价");
        System.out.println("售卖");
    }

    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("收获");
    }

}
