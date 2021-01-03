package com.hfwas.demo01;

import java.util.LinkedList;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo01
 * java.util.LinkedList集合 implements List接口
 *     LinkedList集合的特点:
 *         1.底层是一个链表结构:查询慢,增删快
 *         2.里边包含了大量操作首尾元素的方法
 *         注意:使用LinkedList集合特有的方法,不能使用多态
 *
 *         - public void addFirst(E e):将指定元素插入此列表的开头。
 *         - public void addLast(E e):将指定元素添加到此列表的结尾。
 *         - public void push(E e):将元素推入此列表所表示的堆栈。
 *
 *         - public E getFirst():返回此列表的第一个元素。
 *         - public E getLast():返回此列表的最后一个元素。
 *
 *         - public E removeFirst():移除并返回此列表的第一个元素。
 *         - public E removeLast():移除并返回此列表的最后一个元素。
 *         - public E pop():从此列表所表示的堆栈处弹出一个元素。
 *
 *         - public boolean isEmpty()：如果列表不包含元素，则返回true。
 * @version: 1.0
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * public E removeFirst():移除并返回此列表的第一个元素。
     *  *         - public E removeLast():移除并返回此列表的最后一个元素。
     *  *         - public E pop():从此列表所表示的堆栈处弹出一个元素。
     */
    private static void demo03() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        String remove = list.remove(0);
        //a
        System.out.println(remove);
        //[b, c, d, e]
        System.out.println(list);

        String s = list.removeFirst();
        //b
        System.out.println(s);
        //[c, d, e]
        System.out.println(list);

        String s1 = list.removeLast();
        //e
        System.out.println(s1);
        //[c, d]
        System.out.println(list);

        String pop = list.pop();
        //c
        System.out.println(pop);
        //[d]
        System.out.println(list);

        System.out.println(list.isEmpty());
    }

    /**
     * public E getFirst():返回此列表的第一个元素。
     *  *         - public E getLast():返回此列表的最后一个元素。
     */
    private static void demo02() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        String first = list.getFirst();
        //a
        System.out.println(first);

        String last = list.getLast();
        //e
        System.out.println(last);
    }

    /**
     * public void addFirst(E e):将指定元素插入此列表的开头。
     *  *         - public void addLast(E e):将指定元素添加到此列表的结尾。
     *  *         - public void push(E e):将元素推入此列表所表示的堆栈。
     */
    private static void demo01() {
        //不能使用多态的思想
        //直接创建linkedlist的对象
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //[a, b, c, d, e]
        System.out.println(list);

        list.addFirst("head");
        //[head, a, b, c, d, e]
        System.out.println(list);

        list.addLast("tail");
        //[head, a, b, c, d, e, tail]
        System.out.println(list);
    }
}
