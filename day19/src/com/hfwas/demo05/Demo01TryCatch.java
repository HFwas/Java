package com.hfwas.demo05;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: HFwas
 * @Date: 2021/1/8
 * @Description: com.hfwas.demo05
 * 在jdk1.7之前使用try catch finally 处理流中的异常
 *     格式:
 *         try{
 *             可能会产出异常的代码
 *         }catch(异常类变量 变量名){
 *             异常的处理逻辑
 *         }finally{
 *             一定会指定的代码
 *             资源释放
 *         }
 * @version: 1.0
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域,让finally可以使用
        //变量在定义的时候,可以没有值,但是使用的时候必须有值
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\Java\\GitRep\\JavaSE\\day19\\1.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("helloworld" + i + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //一定会指定的代码
            //创建对象失败了,fw的默认值就是null,null是不能调用方法的,会抛出NullPointerException,
            // 需要增加一个判断,不是null在把资源释放
            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
