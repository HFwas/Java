package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo01
 * throw关键字
 *     作用:
 *         可以使用throw关键字在指定的方法中抛出指定的异常
 *     使用格式:
 *         throw new xxxException("异常产生的原因");
 *     注意:
 *         1.throw关键字必须写在方法的内部
 *         2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
 *         3.throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
 *             throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象,我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
 *             throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常,要么throws,要么try...catch
 * @version: 1.0
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = null;
        demo01(arr,1);
        int[] arr2 = {1,2,3};
        demo01(arr,3);
    }

    private static int demo01(int[] arr,int index) {
        //对数组进行判断
        if (arr == null) {
            throw new NullPointerException("空指针异常");
        }
        //对数组小标进行判断
        if (index < 0 || index < arr.length - 1) {
            throw  new ArrayIndexOutOfBoundsException("数组小标越界异常");
        }
        int result = arr[index];
        return result;
    }
}
