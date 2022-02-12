package com.hfwas.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo01
 * java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。
 *         Exception:编译期异常,进行编译(写代码)java程序出现的问题
 *             RuntimeException:运行期异常,java程序运行过程中出现的问题
 *             异常就相当于程序得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行(吃点药,继续革命工作)
 *         Error:错误
 *             错误就相当于程序得了一个无法治愈的毛病(非典,艾滋).必须修改源代码,程序才能继续执行
 * @version: 1.0
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常,进行编译(写代码)java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1998-05-02");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);


        //RuntimeException:运行期异常,java程序运行过程中出现的问题
        //ArrayIndexOutOfBoundsException:数组越界异常
        int[] arr = new int[3];
        try {
            System.out.println(arr[3]);
            //可能会出现错误的代码
        }catch (Exception e){
            System.out.println(e);
        }

        //java.lang.OutOfMemoryError: Java heap space
        int[] arrary = new int[1024*1024*1024];

    }
}
