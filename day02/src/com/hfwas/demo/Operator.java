package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/7
 * @Description: 运算符
 * @version: 1.0
 */
public class Operator {
    /*
        运算符：进行特定操作的符号。例如：+
        表达式：用运算符连起来的式子叫做表达式。例如：20+3
        分类：算数运算符，赋值运算符，比较运算符，逻辑运算符，三元运算符
        算数运算符：+,-,*,/,%,++,-- 四则运算
        注意事项：
            1.一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种
        "+"号的常见三种用法：
            1.对于数值来说，那就是加法
            2.对于字符char类型来说，在计算之前，char会被提升成int，然后在计算
            3.对于字符串String(首字母大写，并不是关键字)来说，加号代表字符串连接操作
            任何数据类型和字符串进行连接的时候，结果都会变成字符串
        自增自减运算符：++,--
            含义：让一个变量加一位数字1，让一个变量减一个数字1
            格式：i++,i--,++i,--i
            使用方式：
                1.单独使用：不和其他任何操作混合，自己独立成为一个步骤
                2.混合使用：和其他操作混合，例如与赋值混合
            使用区别：
                1.单独使用时候，i++和++i没有任何区别，是完全一样的
                2.混合使用，有重大区别
                    A:i++,先使用i原来的值，再自增1。    先用，再加
                    B:++i,先自增1， 然后使用自增过后的变量值     先加，后用
            注意事项：
                只有变量才可以使用自增，自减运算符，常量不可发生改变，所以不可用
     */
    public static void main(String[] args) {
        //四则运算
        int num = 10;
        int num2 = 20;
        System.out.println(1 + 2);
        System.out.println(num + 9);
        System.out.println(1 - 2);
        System.out.println(num - 2);
        System.out.println(1 * 2);
        System.out.println(num * num2);
        System.out.println(1 / 2);
        System.out.println();

        //取模:取余数
        System.out.println(6 % 2);

        //自增，自减
        int i = 1;
        System.out.println(i++);//1
        System.out.println(i);//2
        System.out.println(i--);//2
        System.out.println(i);//1

        //+号
        String str = "str";
        System.out.println(str);
        str = str + "abc";
        System.out.println(str);//strabc

        String str1 = "Hello";
        System.out.println(str1 + 10);//Hello10
        //优先级问题
        System.out.println("Hello" + 10 + 20);//Hello1020
        System.out.println("Hello" + (10 + 20));//Hello30

    }

}
