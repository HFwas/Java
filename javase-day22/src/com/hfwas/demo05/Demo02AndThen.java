package com.hfwas.demo05;

import java.util.function.Consumer;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo05
 * Consumer接口的默认方法andThen
 *    作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费
 *
 *    例如:
 *     Consumer<String> con1
 *     Consumer<String> con2
 *     String s = "hello";
 *     con1.accept(s);
 *     con2.accept(s);
 *     连接两个Consumer接口  再进行消费
 *     con1.andThen(con2).accept(s); 谁写前边谁先消费
 * @version: 1.0
 */
public class Demo02AndThen {
    public static void main(String[] args) {
        method("Hello",
                (s)->{
                    System.out.println(s.toUpperCase());
                }, (s)->{
                    System.out.println(s.toLowerCase());
                });
    }

    private static void method(String s,Consumer<String> con1,Consumer<String> con2) {
        //con1.accept(s);
        //con2.accept(s);

        //使用andThen方法,把两个Consumer接口连接到一起,在消费数据
        ////con1连接con2,先执行con1消费数据,在执行con2消费数据
        con1.andThen(con2).accept(s);
    }
}
