package com.hfwas.demo05;

import java.util.function.Consumer;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo05
 * java.util.function.Consumer<T>接口则正好与Supplier接口相反，
 *         它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
 *     Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。
 *
 *    Consumer接口是一个消费型接口,泛型执行什么类型,就可以使用accept方法消费什么类型的数据
 *    至于具体怎么消费(使用),需要自定义(输出,计算....)
 * @version: 1.0
 */
public class Demo01Consumer {
    public static void main(String[] args) {
        get("java", new Consumer<String>() {
            @Override
            public void accept(String s) {
                //消费字符串
                //直接输出
                //System.out.println(s);

                //对字符串做一些操作
                String name = new StringBuffer(s).reverse().toString();
                System.out.println(name);
            }
        });
    }

    /**
     * 使用consumer消费string类型的name
     * @param name 一个字符串的姓名
     * @param con 消费接口，泛型使用string类型
     */
    private static void get(String name, Consumer<String> con) {
        con.accept(name);
    }
}
