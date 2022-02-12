package com.hfwas.demo;

import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2020/12/11
 * @Description: Random的使用
 *  Rdndom类用来产生随机数字：Random r = new Random();//小括号当中留空即可
 *  使用：
 *      1.获取一个随机的int数字(范围是int所有范围，有正负两种)：int num = r.nextInt();
 *      2.获取一个随机的int数字(参数戴白哦了范围，左闭右开区间)：int num = r.nextInt(3);
 *      实际上代表的含义是[0,3),也就是0~2
 * @version: 1.0
 */
public class Random {

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int i = random.nextInt();
        System.out.println("产生的数字是：" + i);

        for (int i1 = 0; i1 < 100; i1++) {
            int i2 = random.nextInt(10);
            if (i1 % 25 == 0){
                System.out.println();
            }else {
                System.out.print(" " + i2 + " ");
            }
        }

        //根据int变量n的值，来获取随机数字，范围是[1,n]
        int i1 = random.nextInt();
        int i2 = random.nextInt(i1) + 1;

        System.out.println("范围是[1,n]随机数字:" + i2);

        //用代码模拟猜数字的小游戏
        int num = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum > num){
                System.out.println("猜测数字太大了");
            }else if (guessNum < num){
                System.out.println("猜测数字太小了");
            }else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("游戏结束了");
    }

}
