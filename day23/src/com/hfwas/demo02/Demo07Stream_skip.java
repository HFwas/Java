package com.hfwas.demo02;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo02
 * Stream流中的常用方法_skip:用于跳过元素
 *     如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
 *     Stream<T> skip(long n);
 *         如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 * @version: 1.0
 */
public class Demo07Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"美羊羊","喜洋洋","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> skip = stream.skip(2);
        skip.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                //懒洋洋 灰太狼 红太狼
                System.out.print(string + " ");
            }
        });
    }
}
