package com.hfwas.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo02
 * java.util.Set接口 extends Collection接口
 *     Set接口的特点:
 *         1.不允许存储重复的元素
 *         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *     java.util.HashSet集合 implements Set接口
 *     HashSet特点:
 *          1.不允许存储重复的元素
 *          2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 *          3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 *          4.底层是一个哈希表结构(查询的速度非常的快)
 * @version: 1.0
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");

        //遍历方法
        //第一种：迭代器遍历
        Iterator<String> iterator = set.iterator();
        //a b c
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + " ");
        }

        System.out.println();

        //增强for循环
        //a b c
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}
