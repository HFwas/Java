package com.hfwas.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo02
 * 验证使用泛型和不使用泛型的不同
 * @version: 1.0
 */
public class Demo01Generic {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /**
     * 创建集合对象,使用泛型
     *         好处:
     *             1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
     *             2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
     *          弊端:
     *             泛型是什么类型,只能存储什么类型的数据
     */
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        //错误写法，泛型规定只能使用String类型的对象
//        list.add(1);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //不用做类型转换
            String next = iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 创建集合对象,不使用泛型
     *         好处:
     *             集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
     *         弊端:
     *             不安全,会引发异常
     */
    private static void demo01() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("abc");

        //使用迭代器遍历结合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

            String s = (String) next;
            System.out.println(s);
        }
    }

}
