package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo03
 * 可变参数
 *      可变参数:是JDK1.5之后出现的新特性
 *     使用前提:
 *         当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数.
 *     使用格式:定义方法时使用
 *         修饰符 返回值类型 方法名(数据类型...变量名){}
 *     可变参数的原理:
 *         可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
 *         传递的参数个数,可以是0个(不传递),1,2...多个
 * 可变参数的注意事项
 *             1.一个方法的参数列表,只能有一个可变参数
 *             2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
 * @version: 1.0
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
        //demo01(1,2);
        //demo02(1,2,3,);
        //demo03();
        //demo03(1,2,3);
        int sum = demo03(1, 2, 3, 4, 5, 6);
        //21
        System.out.println(sum);

        //demo04();
        demo05(1,2,1,2,3,5);
    }

    //可变参数在方法中的位置，有多个参数时候，可变参数必须在最后一个参数位置上
    private static void demo05(int a,int b,int...arr) {
    }

    //错误写法，不能有两个以上的可变参数
//    private static void demo04(int...arr,String...strings) {
//
//    }


    /**
     * 没有传参数的情况下
     * 底层是一个数组，相当于new int[arr.length];
     * demo03(1,2,3);   arr=[I@1b6d3586     arr.length = 3
     * @param arr
     * @return
     */
    private static int demo03(int...arr) {
        //demo();的情况下:[I@1b6d3586
        System.out.println(arr);
        //0
        System.out.println(arr.length);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    private static int demo02(int a,int b,int c) {
        return a+b+c;
    }

    private static int demo01(int a,int b) {
        return a+b;
    }
}
