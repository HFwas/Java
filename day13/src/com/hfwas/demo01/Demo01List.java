package com.hfwas.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo01
 * java.util.List接口 extends Collection接口
 *     List接口的特点:
 *         1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
 *         2.有索引,包含了一些带索引的方法
 *         3.允许存储重复的元素
 *
 *     List接口中带索引的方法(特有)
 *         - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
 *         - public E get(int index):返回集合中指定位置的元素。
 *         - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
 *         - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
 *     注意:
 *         操作索引的时候,一定要防止索引越界异常
 *         IndexOutOfBoundsException:索引越界异常,集合会报
 *         ArrayIndexOutOfBoundsException:数组索引越界异常
 *         StringIndexOutOfBoundsException:字符串索引越界异常
 * @version: 1.0
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //[a, b, c, d, e]
        System.out.println(list);

        String s = list.get(0);
        //a
        System.out.println(s);

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        String remove = list.remove(0);
        System.out.println(remove);
        //[b, c, d, e]
        System.out.println(list);

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        list.set(0,"aaaaa");
        //[aaaaa, c, d, e]
        System.out.println(list);

        //list集合遍历有三种方式
        //使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            System.out.println(s1);
        }

        //使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        
        //增强for循环
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
