package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/7
 * @Description: 判断语句
 * @version: 1.0
 */
public class JudgmentStatement {
    /*
        If语句
            单If语句,If..else
            if ..else if()...else if()....else...
     */
    public static void main(String[] args) {
        int age = 15;
        if (age >= 18){
            System.out.println("进网吧");
        }else{
            System.out.println("回家");
        }

        int num = 20;
        if (num %2 != 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

        //练习
        int x = 10;
        int y;
        if (x >= 3){
            y = 2 * x + 3;
            System.out.println(y);
        }else if (x > -1){
            y = 2*x;
            System.out.println(y);
        }else{
            y = 2 * x -1;
            System.out.println(y);
        }

        //考试分数
        int score = 100;
        if (score >= 90 && score <= 100){
            System.out.println("优秀");
        }else if (score >= 80 && score < 90){
            System.out.println("好");
        }else if (score >= 70 && score < 80){
            System.out.println("良");
        }else if (score >= 60 && score < 70){
            System.out.println("及格");
        }else if (score >= 0 && score < 60){
            System.out.println("不及格");
        }else {
            System.out.println("数据不合理");
        }

        //用if else 替换三元用算符
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("最大值" + max);
        if (a > b){
            max = a;
        }else {
            max = b;
        }
        System.out.println("最大值: " + max);
    }

}
