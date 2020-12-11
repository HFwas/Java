package com.hfwas.demo;

import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2020/12/11
 * @Description: 匿名对象
 * @version: 1.0
 */
public class Anonymous {

    public static void main(String[] args) {
        //普通使用方式
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        //匿名使用方式
        int i1 = new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + i1);

        //使用一般写法传入参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);

        //使用匿名对象传参
        Scanner scac = getScanner();
        String next = scac.next();
        System.out.println("传入的参数是：" + next);
    }

    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的参数是：" + i);
    }

    public static Scanner getScanner(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }


}
