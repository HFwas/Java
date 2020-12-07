package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/7
 * @Description: 赋值运算符，比较运算符，逻辑运算符
 * @version: 1.0
 */
public class Operator2 {
    /*
        赋值运算符：
            1.基本赋值运算符：就是一个"="号，int a = 20;
            2.复合赋值运算符：+=,-=,/=,*=,%=
            注意事项：
                1.只有变量才能使用赋值运算符，常量不能进行赋值
                2.复合赋值运算符其中隐含了一个强制类型转换
        比较运算符：
            ==,<,>,<=,>=,!=
            注意事项：
                1.比较运算符的结果一定是一个boolean值，true或者false
                2.如果进行多次比较，不能连着写
                数学当中1<x<3,程序当中不允许这样写法
        逻辑运算符：与&&,或||,非!
            &&:全是ture，才是true
            ||:至少一个一个是true,才是true
            !:本来是true,变成false
            与(&&),或(||)具有短路作用:如果根据左边已经可以得到最终结果，那么右边的代码将不再执行，从而节省一定的性能
            注意事项：
                1.逻辑运算符只能用于boolean值
                2.与，或需要左右各自有一个boolean值，但是取反只需要一个boolean值
                3.与，或两种运算符，如果有多个条件，可以连续写
        三元运算符：三个数据才可以进行操作的运算符
            格式：变量名称 = 条件判断 ? 表达式A ： 表达式B
            注意事项：
                1.必须同时保证表达式A和表达式B都符合左侧数据类型的要求
                2.三元运算符的结果必须被使用
     */
    public static void main(String[] args) {
        int num = 10;
        num += 9;
        System.out.println(num);//19
        num -= 1;
        System.out.println(num);//18
        num *= 2;
        System.out.println(num);//36
        num %= 2;
        System.out.println(num);//0

        // byte + int --> int
        byte b = 9;
        b += 1;
        System.out.println(b);

        System.out.println(10 > 7);//true
        System.out.println(7 == 7);//true
        int num2 = 100;
        System.out.println(num >= 120);//false

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false

        //逻辑运算符
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println(false || true);//true
        System.out.println(!false);//true

        //验证短路作用
        int num3 = 10;
        System.out.println(num3 > 78 && (++num3)>20);//false %% .....
        System.out.println(num3);//10

        //三元运算符
        int num1 = 10;
        int result = 20;
        System.out.println(num1 = (num1 > result)? num1 : result);
    }

}
