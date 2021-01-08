package com.hfwas.demo05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo05
 * JDK7的新特性
 *     在try的后边可以增加一个(),在括号中可以定义流对象
 *     那么这个流对象的作用域就在try中有效
 *     try中的代码执行完毕,会自动把流对象释放,不用写finally
 *     格式:
 *         try(定义流对象;定义流对象....){
 *             可能会产出异常的代码
 *         }catch(异常类变量 变量名){
 *             异常的处理逻辑
 *         }
 * @version: 1.0
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try (
                //1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("E:\\czxt\\Ghost\\PE\\1.jpg");
             //2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
             FileOutputStream fos = new FileOutputStream("E:\\czxt\\Ghost\\2.jpg");
             ){
            byte[] bytes = new byte[1024];
            int length = 0;
            // 3.使用字节输入流对象中的方法read读取文件
            while ((length = fis.read(bytes)) != -1) {
                //写入
                //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
                fos.write(bytes,0,length);
            }

            //5.释放资源
            fos.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
