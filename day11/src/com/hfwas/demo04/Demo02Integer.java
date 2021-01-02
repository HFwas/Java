package com.hfwas.demo04;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo04
 * 自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
 *     JDK1.5之后出现的新特性
 * @version: 1.0
 */
public class Demo02Integer {

    public static void main(String[] args) {
        //自动装箱:直接吧int类型整数赋值给包装类
        Integer i = 1;

        //自动拆箱
        //相当于i.intValue() + 2
        i = i + 2;
        System.out.println(i);

        //arraylist集合无法直接存储整数，可以存储integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        //自动装箱，相当与new integer(1);
        list.add(1);

        //自动拆箱，相当于intValue()
        int a = list.get(0);
        System.out.println(a);

    }

}
