package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个位置的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
 * 泛型可以接受任意的数据类型，可以使用Integer,String,Student.....
 * 创建对象的时候确定泛型的数据类型
 * @version: 1.0
 */
public class Demo02GenericClass {
    public static void main(String[] args) {
        //不写。默认为object类
        GenericClass aClass = new GenericClass();
        aClass.setName("aa");
        //aa
        System.out.println(aClass.getName());

        //创建GenericClass对象，使用String类型
        GenericClass<String> aClass1 = new GenericClass<>();
        aClass1.setName("ddddddddd");
        //ddddddddd
        System.out.println(aClass1.getName());

        //integer
        GenericClass<Integer> aClass2 = new GenericClass<>();
        aClass2.setName(22);
        System.out.println(aClass2.getName());
    }

}
