package com.hfwas;

/**
 * @Auther: HFwas
 * @Date: 2020/12/6
 * @Description:    常量
 * @version: 1.0
 */
public class DemoConst {

    /*
        常量：在程序运行当中保持不变的量
        分类：
            1.字符串常量：凡是用双引号引起来的部分，叫做字符串常量，例如："d","dd","123"
            2.整数常量：直接写上的数字。例如：1，2，3
            3.布尔型常量：
            4.浮点型常量:boolean只有两种取值,例如：true,false
            5.字符常量：凡是用''引起来的单个字符，例如：'z','d'
            6.空常量：null值，代表没有任何取值
     */
    public static void main(String[] args) {
        //字符串常量
        String str = "abc";
        System.out.println(str);
        System.out.println("");//这种可以
        System.out.println("123");

        //整数常量
        System.out.println(23);
        System.out.println(-23);

        //布尔型常量
        System.out.println(true);
        System.out.println(false);

        //浮点型常量
        System.out.println(1.55);
        System.out.println(-2.0);

        //字符型常量
        System.out.println('s');
        System.out.println('2');
        //System.out.println('');//这种不可以
        //System.out.println('ss');//这种也不可以，有且只有一个字符

        //空常量
        //System.out.println(null);//这种不可以拿来直接输出
    }

}
