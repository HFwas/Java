package com.hfwas.demo04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo04
 * - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 *     注意:
 *          sort(List<T> list)使用前提
 *          被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则
 *     Comparable接口的排序规则:
 *         自己(this)-参数:升序
 * @version: 1.0
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        //[1, 3, 2]
        System.out.println(list);

        //默认是升序的
        Collections.sort(list);
        //[1, 2, 3]
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        list1.add("b");
        //[a, c, b]
        System.out.println(list1);

        //默认是升序的
        Collections.sort(list1);
        //[a, b, c]
        System.out.println(list1);

        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("张三",25));
        list2.add(new Person("王五",19));
        list2.add(new Person("李四",36));
        //[Person{name='张三', age=25}, Person{name='王五', age=19}, Person{name='李四', age=36}]
        System.out.println(list2);

        Collections.sort(list2);
        //[Person{name='李四', age=36}, Person{name='张三', age=25}, Person{name='王五', age=19}]
        System.out.println(list2);
    }
}
