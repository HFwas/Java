package com.hfwas.java1.chapter02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter02
 * 指令8：异常处理
 * @version: 1.0
 */
public class ExceptionTest {

    public void throwZero(int i){
        if (i == 0){
            throw new RuntimeException("参数值为0");
        }
    }

    public void throwOne(int i) throws RuntimeException{
        if (i == 1){
            throw new RuntimeException("参数值为1");
        }
    }

    public void throwArithmetic(){
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    public void tryCatch(){
        try {
            File file = new File("a.txt");
            FileInputStream fis = new FileInputStream(file);
            String str = "hello";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static String func(){
        String str = "hello";
        try {
            return str;
        } finally {
            str = "hellojava";
        }
    }

    public static void main(String[] args) {
        //hello
        System.out.println(func());
    }
}
