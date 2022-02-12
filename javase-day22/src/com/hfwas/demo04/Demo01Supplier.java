package com.hfwas.demo04;

import java.util.function.Supplier;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo04
 * 常用的函数式接口
 *     java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。
 *
 *     Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 * @version: 1.0
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        /*String s = getString(() -> {
            return "java";
        });
        System.out.println(s);*/

        //简化，使用lambda表达式
        String string = getString(() -> "java");
        System.out.println(string);
    }

    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }
}
