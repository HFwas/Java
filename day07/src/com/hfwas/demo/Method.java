package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: 字符串中获取相关的方法
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度
 * public char charAt(int index):将当前字符串和参数字符串拼接成为返回值新的字符串
 * public String concat(String str):获取指定索引位置的单个字符。（索引从0开始）
 * public int indexOf(String str):查找参数字符串再本字符串当中首次出现的索引位置，如果没有返回-1
 * public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
 * public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串
 * 备注：[begin,end)，包含左边，不包含右边
 * public char[] toCharArray():将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes():获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,CharSequence newString):将所有出现的老字符串替换称为新的字符串，返回替换之后的结果新字符串
 * @version: 1.0
 */
public class Method {

    public static void main(String[] args) {
        int length = "sdhfidfhidfhid".length();
        //字符串长度：14
        System.out.println(length);

        String str1 = "hello";
        //索引为0的字符串字符为h
        System.out.println(str1.charAt(0));

        String str2 = "world";
        String str3 = str1.concat(str2);
        //hello
        System.out.println(str1);
        //world
        System.out.println(str2);
        //helloworld
        System.out.println(str3);

        String str = "helloworld";
        int index = str.indexOf("llo");
        //2
        System.out.println(index);

        int index1 = str.indexOf("llop");
        //-1
        System.out.println(index1);

        //截取方法
        String substring = str.substring(2);
        //lloworld
        System.out.println(substring);
        String substring1 = str.substring(2, 5);
        //llo
        System.out.println(substring1);

        //str6内容并没有改变，改变的是str6的地址值
        String str6 = "java";
        //java
        System.out.println(str6);
        str6 = "ddd";
        //ddd
        System.out.println(str6);

        //字符串转换为字符数组
        char[] array = str.toCharArray();
        System.out.println(array[0]);
        System.out.println(array.length);

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }

        //替换
        String ss = "dfq dfqjof dfdp";
        String replace = ss.replace("q", "*");
        //dfq dfqjof dfdp
        System.out.println(ss);
        //df* df*jof dfdp
        System.out.println(replace);
    }

}
