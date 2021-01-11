package com.hfwas.demo02;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo2
 * Stream流中的常用方法_forEach
 *     void forEach(Consumer<? super T> action);
 *     该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
 *     Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据
 *
 *     简单记:
 *         forEach方法,用来遍历流中的数据
 *         是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 * @version: 1.0
 */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
