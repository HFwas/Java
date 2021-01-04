package com.hfwas.demo02;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/4
 * @Description: com.hfwas.demo02
 * finally代码块
 *      格式:
 *         try{
 *             可能产生异常的代码
 *         }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *             异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 *             一般在工作中,会把异常的信息记录到一个日志中
 *         }
 *         ...
 *         catch(异常类名 变量名){
 *
 *         }finally{
 *             无论是否出现异常都会执行
 *         }
 *      注意:
 *         1.finally不能单独使用,必须和try一起使用
 *         2.finally一般用于资源释放(资源回收),无论程序是否出现异常,最后都要资源释放(IO)
 * @version: 1.0
 */
public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try {
            demo01("c:\\a.ttxt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论发生什么异常都会执行
            System.out.println("无论什么情况都会执行");
        }
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
