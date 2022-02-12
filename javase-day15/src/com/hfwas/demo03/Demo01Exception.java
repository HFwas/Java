package com.hfwas.demo03;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo03
 * 多个异常使用捕获又该如何处理呢？
 *             1. 多个异常分别处理。
 *             2. 多个异常一次捕获，多次处理。
 *             3. 多个异常一次捕获一次处理。
 * @version: 1.0
 */
public class Demo01Exception {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * 3. 多个异常一次捕获一次处理。
     */
    private static void demo03() {
        try {
            int[] arr = {1,2,3};
            //ArrayIndexOutOfBoundsException
            System.out.println(arr[3]);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            //IndexOutOfBoundsException
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    /**
     * 2. 多个异常一次捕获，多次处理。
     * 一个try多个catch注意事项:
     *                 catch里边定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
     *                 ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
     */
    private static void demo02() {
        try {
            int[] arr = {1,2,3};
            //ArrayIndexOutOfBoundsException
            System.out.println(arr[3]);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            //IndexOutOfBoundsException
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    /**
     * 多个异常分别处理
     */
    private static void demo01() {
        try {
            int[] arr = {1,2,3};
            //ArrayIndexOutOfBoundsException
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println(e);
        }

        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            //IndexOutOfBoundsException
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("后续代码");
    }


}
