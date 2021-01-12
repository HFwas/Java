package com.hfwas.demo02;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo02
 * Stream流中的常用方法_concat:用于把流组合到一起
 *     如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
 *     static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 * @version: 1.0
 */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        String[] arr1 = {"你好","我好","他也好"};
        int[] num = {1,2,3,4,5,6};
        Stream<String> stream1 = Stream.of(arr);
        Stream<String> stream3 = Stream.of(arr1);
        //Stream<int[]> stream2 = Stream.of(num);
        //Stream<Serializable> concat = Stream.concat(stream1, stream2);
        /*concat.forEach(new Consumer<Serializable>() {
            @Override
            public void accept(Serializable serializable) {
                //a b c d e [I@4554617c
                System.out.print(serializable + " ");
            }
        });*/

        Stream<Serializable> concat = Stream.concat(stream1, stream3);
        concat.forEach(new Consumer<Serializable>() {
            @Override
            public void accept(Serializable serializable) {
                //a b c d e 你好 我好 他也好
                System.out.print(serializable + " ");
            }
        });
    }
}
