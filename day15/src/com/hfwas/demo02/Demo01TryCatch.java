package com.hfwas.demo02;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo02
 * try...catch:异常处理的第二种方式,自己处理异常
 *     格式:
 *         try{
 *             可能产生异常的代码
 *         }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *             异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 *             一般在工作中,会把异常的信息记录到一个日志中
 *         }
 *         ...
 *         catch(异常类名 变量名){
 *         }
 *     注意:
 *         1.try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
 *         2.如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
 *           如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 * @version: 1.0
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            //可能产生异常的代码
            demo01("c:\\a.tx");
        } catch (IOException e) {
            //异常的处理逻辑，
            e.printStackTrace();

//            Throwable类中定义了3个异常处理的方法
//            String getMessage() 返回此 throwable 的简短描述。
//            String toString() 返回此 throwable 的详细消息字符串。
//            void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的

            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        //后边有代码可以正常执行
        System.out.println("后续代码");
    }

    private static void demo01(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("文件路径错误");
        }

        if (fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名错误");
        }
    }
}
