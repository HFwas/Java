package com.hfwas.demo02;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo2
 * Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
 *     Stream<T> filter(Predicate<? super T> predicate);
 *     filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
 *     Predicate中的抽象方法:
 *         boolean test(T t);
 * @version: 1.0
 */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e");
        Stream<String> stream1 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        });

        /**
         * Stream流属于管道流,只能被消费(使用)一次
         * 第一个Stream流调用完毕方法,数据就会流转到下一个Stream上
         * 而这时第一个Stream流已经使用完毕,就会关闭了
         * 所以第一个Stream流就不能再调用方法了
         * IllegalStateException: stream has already been operated upon or closed
         */
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
