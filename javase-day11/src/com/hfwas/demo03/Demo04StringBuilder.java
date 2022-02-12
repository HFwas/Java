package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo03
 * StringBuilder和String可以相互转换:
 *         String->StringBuilder:可以使用StringBuilder的构造方法
 *             StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 *         StringBuilder->String:可以使用StringBuilder中的toString方法
 *             public String toString()：将当前StringBuilder对象转换为String对象
 * @version: 1.0
 */
public class Demo04StringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("ad");
        builder.append(true);
        builder.append(123);
        //会调用toString方法
        System.out.println(builder);

        StringBuilder dfadfda = new StringBuilder("dfadfda");
        System.out.println(dfadfda);

    }

}
