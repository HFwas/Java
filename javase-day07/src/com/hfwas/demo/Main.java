package com.hfwas.demo;

/**
 * 字符串：java.lang.String类代表字符串
 *  API当中说，Java程序中的所有字符串字面值(如："abc")都作为此类的实例实现
 *  其实就是说：程序当中所有的双引号字符串，都是String类的对象，就算没有new，也照样是
 *
 *  特点：
 *      1.字符串的内容永不可变[重点]
 *      2.正式因为字符串不可改变，所以字符串是可以共享使用的
 *      3.字符串效果上相当于char[]数组，但是底层原理是byte[]数组
 *  创建字符串的常见3+1中方式：
 *      三种构造方法：
 *      1.public String():创建一个留空的字符串，不含有任何内容
 *      2.public String(char[] array):根据字符数组的内容，来创建对应的字符串
 *      3.public String(byte[] array):根据字节数组的内容，来创建对应的字符串
 *      一种直接创建：
 *      1.String str = "ddd";
 * 字符串的常量池：
 *
 * 比较：==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
 * 注意事项：
 *      1.任何对象都能用object及逆行接受
 *      2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 *      3.如果比较双方一个常量一个变量，推荐吧持仓量字符写在前面
 *      推荐：:"abc".equals(str)      不推荐：str.equals("abc")
 *      public boolean eualsIgnoreCase(String str):忽略大小写，进行内容比较
 */
public class Main {

    public static void main(String[] args) {
        //使用空参创建字符串
        String str1 = new String();
        System.out.println(str1);

        //使用char数组创建字符串
        char[] str = new char[]{'a','b','c','d','e'};
        String str2 = new String(str);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] by = new byte[]{97,98,99};
        String str3 = new String(by);
        //输出结果是：abc
        System.out.println(str3);

        //字符串常量池
        String string1 = "abc";
        String string2 = "abc";

        char[] array = new char[]{'a','b','c'};
        String str4 = new String(array);

        //输出结果：true
        System.out.println(string1 == string2);
        //输出结果：false
        System.out.println(string1 == str4);
        //输出结果：false
        System.out.println(string2 == str4);
        System.out.println();

        //输出结果是：true
        System.out.println(string1.equals(string2));
        //输出结果是：true
        System.out.println(string2.equals(string1));
        //输出结果是：true
        System.out.println(string1.equals(str4));
        //输出结果是：true
        System.out.println("abc".equals(string1));
        //输出结果是：true
        System.out.println(str4.equals("abc"));

        String strA = "Java";
        String strB = "java";
        //输出结果是：false
        System.out.println(strA.equals(strB));
        //忽略大小写比较，true
        System.out.println(strA.equalsIgnoreCase(strB));
    }











}
