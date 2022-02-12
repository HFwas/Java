package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/8
 * @Description: 循环结构
 * @version: 1.0
 */
public class CycleStructure {
    /*
        循环结构：循环结构的基本组成部分，一般可以分成四部分
            1.初始化语句：在循环开始最初执行，而且制作唯一一次
            2.条件判断：如果成立，则循环继续；如果不成立，则循环退出
            3.循环体：重复要做的事情内容，若干行语句。
            4.步进语句：每次循环之后要要进行的扫尾工作
        for循环：
            格式：for(初始化表达式;布尔表达式;步进表达式){
                循环体;
            }
        while循环：
            格式：while(条件判断){
                    循环体;
        do while
            格式：do{
                循环体;
            }while(条件判断);
        三种循环之间的区别：
            1.如果条件判断从来没有满足过，那么for循环和while循环不会执行，但是dowhile循环会至少执行一次
            2.for循环的变量在小括号当中定义，只有循环内部才可以使用。while循环和do-while循环初始化语句本来就在外面，所以出来循环之后就可以继续使用
        break关键字：
            1.可以用在switch语句当中，一旦执行，整个switch语句立刻结束
            2.还可以用在循环语句当中，一旦执行，整个循环语句立刻执行。打断循环
            建议:凡是次数确定的场景多用for循环，否则多用while循环
        continue关键字：一旦执行，立即跳过当前循环剩余内容，马上开始下一次循环
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("我错了 " + i);
        }
        System.out.println("程序结束");

        int i = 0;//初始化
        while (i <= 10){
            System.out.println("我错了" + i);//循环体
            i++;//步进语句
        }

        //do while:先执行，再判断
        int num = 0;
        do {
            System.out.println("数字"+ i);
        }while (i <= 10);

        //用循环求出1-100之间偶数和
        int result = 0;
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0){
                result += j;
            }
        }
        System.out.println(result);

        //验证区别1
        int num2 = 0;
        while (num2 < 0){
            System.out.println("hello  while");//
            num2++;
        }

        int num3 = 0;
        do {
            System.out.println("hello do while"); //hello do while
            num3++;
        }while (num3 < 0);

        //测试break,continue
        for (int j = 0; j < 10; j++) {
            if (j == 4){//当前是第四次时，打断整个循环，只会输出前三次结果
                break;
            }
            System.out.println("数字"+j);//0,1,2,3
        }

        for (int j = 0; j < 10; j++) {
            if (j == 4){//跳过第四次，输出其他九个数字
                continue;
            }
            System.out.println("数字"+j);//0,1,2,3,5,6,7,8,9
        }
    }

}
