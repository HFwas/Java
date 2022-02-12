package com.hfwas.demo;

import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: 出现的各种字符的次数
 * @version: 1.0
 */
public class StrignCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        //大写字母
        int countUpper = 0;
        //小写字母
        int countLower = 0;
        //数字
        int countNumber = 0;
        //其他
        int countOthers = 0;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if ( 'A' <= ch && ch <= 'Z') {
                countUpper++;
            }else if ('a' <= ch && ch <= 'z') {
                countLower++;
            }else if ('0' <= ch && ch <= '9'){
                countNumber++;
            } else {
                countOthers++;
            }
        }

        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOthers);
    }

}
