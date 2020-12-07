package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/7
 * @Description: ASCII编码表:美国信息交换标准代码
 * Unicode码表：万国码,也是数字和符号的对照关系，开头0-127部分和ASCII一模一样，但是从128开始包含更多信息
 * @version: 1.0
 */
public class DataTypeChar {

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0);//97

        char ch1 = '1';
        System.out.println(ch1 + 0);//49

        char ch2 = 'A';//其实底层保存的时65
        System.out.println(ch2 + 0);

        //左侧是int类型，右侧是char类型
        //char --> int。确实是从小到大，发生了自动类型转换
        char ch3 = 'c';
        System.out.println(ch3 + 0);

        char ch4 = '中';
        System.out.println(ch4 + 0);//20013

    }

}
