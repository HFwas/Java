package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: 分割字符串
 * @version: 1.0
 */
public class StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String str2 = "aaa bbb ccc";
        String[] s = str2.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        String str3 = "aaa.bbb.ccc";
        //String[] split1 = str3.split(".");//格式错误
        String[] split1 = str3.split("\\.");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }

}
