package com.hfwas.demo01;

import java.util.Objects;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo01
 * Obects类中的静态方法
 *     public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
 *     源码:
 *         public static <T> T requireNonNull(T obj) {
 *             if (obj == null)
 *                 throw new NullPointerException();
 *             return obj;
 * @version: 1.0
 */
public class Demo04Objects {
    public static void main(String[] args) {
        demo01(null);
    }

    private static void demo01(Object object) {
//        if (object == null) {
//            throw new NullPointerException("空指针异常");
//        }

        //NullPointerException:空指针异常
        //Objects.requireNonNull(object);

        //NullPointerException: 空指针异常
        Objects.requireNonNull(object,"空指针异常");
    }
}
