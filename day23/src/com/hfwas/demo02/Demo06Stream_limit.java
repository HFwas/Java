package com.hfwas.demo02;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: HFwas
 * @Date: 2021/1/12
 * @Description: com.hfwas.demo02
 * Stream流中的常用方法_limit:用于截取流中的元素
 *     limit方法可以对流进行截取，只取用前n个。方法签名：
 *     Stream<T> limit(long maxSize);
 *         参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
 *     limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 * @version: 1.0
 */
public class Demo06Stream_limit {
    public static void main(String[] args) {
        Stream<String> stream23 = Stream.of("1", "2", "3", "4", "5");
        Stream<String> limit = stream23.limit(3);
        stream23.forEach((s)-> System.out.println(s));
    }
}
