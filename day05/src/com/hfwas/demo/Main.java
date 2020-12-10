package com.hfwas.demo;

import java.util.Arrays;

/**
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理灭一个细节
 * 面向对象：当需要实现一个功能的时候，不需要关系具体的步骤，而是找一个已经具有改功能的人，来帮我做事
 * 区别：
 *      1.面向过程：强调步骤
 *      2.面向对象：强调对象
 * 特点：三个基本特征：封装，继承，多态
 *
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
 * 1.导包：也就是指出需要使用的类，在什么位置，对于和当前类属于同一个包的情况，可以省略导包语句不写
 * 2.创建，格式
 *      类名称 对象名 = new 类名称();
 * 3.使用，分为两种请
 *      1.使用成员变量：对象名.成员变量名
 *      2.使用成员方法：对象名.成员方法名(参数)
 */
public class Main {

    public static void main(String[] args) {
        int[] num = new int[]{10,20,30,40,50};
        //输出格式为[10,20,30,40,50]

        //使用面向过程，每一步都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1){
                System.out.print(num[i] + "]");
            }else {
                System.out.print(num[i] + ", ");
            }
        }

        System.out.println();

        //使用面向对象
        // Arrays中有一个toString方法，可以让我们得到想要的格式
        System.out.println(Arrays.toString(num));

        //1.导包，因为Student在一个包下，不需要导包
        //2.创建，格式
        Student stu = new Student();

        //3.使用成员变量，成员方法
        System.out.println(stu.age); //0
        System.out.println(stu.name); //null

        //改变内容
        stu.name = "胡歌";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();

        Phone one = new Phone();
        System.out.println(one.brand); //null
        System.out.println(one.price); //0.0
        System.out.println(one.color); //null

        one.brand = "苹果";
        one.price = 9999.00;
        one.color = "红色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        Phone two = new Phone();
//        Phone two = one;
        System.out.println(two.brand); //null
        System.out.println(two.price); //0.0
        System.out.println(two.color); //null

        two.brand = "三星";
        two.price = 8999.00;
        two.color = "黑色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("马云");
        two.message();
    }
}
