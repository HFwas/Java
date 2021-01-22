package com.hfwas.java.chapter05;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/1/22
 * @Description: com.hfwas.java.chapter05
 * 方法返回地址
 * 在字节码指令中，返回指令包含ireturn（当返回值是boolean，byte，char，short和int类型时使用），
 * lreturn（Long类型），freturn（Float类型），dreturn（Double类型），areturn。
 * 另外还有一个return指令声明为void的方法，实例初始化方法，类和接口的初始化方法使用。
 * @version: 1.0
 */
public class ReturnAddressTest {
    public boolean methodBoolean(){
        return false;
    }

    public byte methodByte(){
        return 0;
    }

    public short methodShort(){
        return 0;
    }

    public char methodChar(){
        return 'a';
    }

    public int methodInt(){
        return 0;
    }

    public long methodLong(){
        return 2L;
    }

    public float methodFloat(){
        return 1;
    }

    public double methodDouble(){
        return 0.0;
    }

    public String methodString(){
        return null;
    }

    public Date methodDate(){
        return null;
    }

    public void methodVoid(){

    }

    static {
        int i = 10;
    }

    public void method02(){
        try {
            method01();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method01() throws IOException {
        FileReader fr = new FileReader("hfwas.txt");
        char[] chars = new char[1024];
        int length;
        while ((length = fr.read(chars)) != -1) {
            String s = new String(chars, 0, length);
            System.out.println(s);
        }
        fr.close();
    }
}
