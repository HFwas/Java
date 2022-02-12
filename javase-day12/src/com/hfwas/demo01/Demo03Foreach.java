package com.hfwas.demo01;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo01
 * 增强for循环
 * 增强for循环:底层使用的也是迭代器,使用for循环的格式,简化了迭代器的书写
 *     是JDK1.5之后出现的新特性
 *     Collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for
 *     public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。
 *
 *     增强for循环:用来遍历集合和数组
 *
 *     格式:
 *         for(集合/数组的数据类型 变量名: 集合名/数组名){
 *             sout(变量名);
 *         }
 * @version: 1.0
 */
public class Demo03Foreach {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (Integer a : list) {
            System.out.println(a);
        }
    }

    /**
     * 使用增强for循环遍历集合
     */
    private static void demo01() {
        int[] arra = {1,2,3,4,5,6};
        for (int a : arra) {
            System.out.println(a);
        }
    }

}
