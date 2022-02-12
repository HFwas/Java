package com.hfwas.demo04;

import java.util.function.Supplier;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo04
 * 练习：求数组元素最大值
 *         使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
 *         提示：接口的泛型请使用java.lang.Integer类。
 * @version: 1.0
 */
public class Demo02Test {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,6,30,4};
        Integer maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中最大值：" + maxValue);
    }

    private static Integer getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
