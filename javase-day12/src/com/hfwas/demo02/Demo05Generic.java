package com.hfwas.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 * 泛型的通配符:
 *         ?:代表任意的数据类型
 *     使用方式:
 *         不能创建对象使用
 *         只能作为方法的参数使用
 * @version: 1.0
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");

        demo01(list);
        demo01(list1);
    }

    /**
     * 定义一个方法，可以遍历所有类型的集合
     * @param list
     */
    private static void demo01(ArrayList<?> list) {
        //使用迭代器遍历
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
