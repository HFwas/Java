package com.hfwas.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo04
 * - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
 *         public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。
 *      Comparator和Comparable的区别
 *         Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
 *         Comparator:相当于找一个第三方的裁判,比较两个
 *
 *     Comparator的排序规则:
 *         o1-o2:升序
 * @version: 1.0
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序排序
                //return o1 - o2;

                //降序排序
                return o2 - o1;
            }
        });

        //return o1 - o2;
        //[1, 2, 3]
        System.out.println(list);

        //return o2 - o1;
        //[3, 2, 1]
        System.out.println(list);

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("b张三",25));
        list1.add(new Student("d张三",18));
        list1.add(new Student("a张三",36));
        list1.add(new Student("a张三",12));
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getAge() - o2.getAge();
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        //[Student{name='a张三', age=12}, Student{name='d张三', age=18}, Student{name='b张三', age=25}, Student{name='a张三', age=36}]
        System.out.println(list1);
    }
}
