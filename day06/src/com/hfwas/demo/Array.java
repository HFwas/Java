package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/11
 * @Description: 对象数组
 * 定义一个数组，用来存放三个Person对象
 * 数组有一个缺点，一旦创建，程序运行期间长度不可以发生改变
 * @version: 1.0
 */
public class Array {

    public static void main(String[] args) {
        //创建一个数组，数组大小为3，存放person对象
        Person[] num = new Person[3];

        Person one = new Person("1",15);
        Person two = new Person("2",58);
        Person three = new Person("3",68);

        num[0] = one;
        num[1] = two;
        num[2] = three;

        System.out.println(num[0]);//地址值
        System.out.println(num[1]);//地址值
        System.out.println(num[2]);//地址值

        System.out.println(num[0].getName());
    }

}
