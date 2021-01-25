package com.hfwas.java.chapter13;

import org.junit.Test;

/**
 * @Author: HFwas
 * @Date: 2021/1/25
 * @Description: com.hfwas.java.chapter13
 * 字符串拼接操作
 * @version: 1.0
 */
public class StringTest5 {
    @Test
    public void test01(){
        // 得到 abc的常量池
        String s1 = "a" + "b" + "c";
        // abc存放在常量池，直接将常量池的地址返回
        String s2 = "abc";

        //最终java编译成.class，再执行.class

        // true，因为存放在字符串常量池
        System.out.println(s1 == s2);
        // true
        System.out.println(s1.equals(s2));
    }

    @Test
    public void test02(){
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        //编译器的优化
        String s4 = "javaEE" + "hadoop";
        //如果拼接符号的前后出现了变量，则相当于在堆空间中new String(),具体的内容为拼接的结果
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        // true
        System.out.println(s3 == s4);
        // false
        System.out.println(s3 == s5);
        // false
        System.out.println(s3 == s6);
        // false
        System.out.println(s3 == s7);
        // false
        System.out.println(s5 == s6);
        // false
        System.out.println(s5 == s7);
        // false
        System.out.println(s6 == s7);

        //intern();判断字符串常量池中是否存在javaEEhadoop值，如果存在，则返回常量池中javaEEhadoop的地址
        //如果字符串常量池中不存在javaEEhadoop，则在常量池中加载一份javaEEhadoop，并返回此对象的地址
        String s8 = s6.intern();
        // true
        System.out.println(s3 == s8);
    }

    @Test
    public void test03(){
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";

        /**
         * str1 + str2的执行细节(变量s是临时定义的)：
         * - StringBuilder s = new StringBuilder();
         * - s.append(s1);
         * - s.append(s2);
         * - s.toString();  -> 约等于new String("ab");
         * 补充：在JDK5.0之后，使用的是StringBuilder,在JDK5.0之前使用的是StringBuffer.
         */
        String str4 = str1 + str2;
        //false
        System.out.println(str3 == str4);
    }

    @Test
    public void test04(){
        final String str1 = "a";
        final String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        //true
        System.out.println(str3 == str4);
    }

    @Test
    public void test05(){
        String str1 = "javaEEhadoop";
        String str2 = "javaEE";
        String str3 = str2 + "hadoop";
        //false
        System.out.println(str1 == str3);

        //常量
        final String str4 = "javaEE";
        String str5 = str4 + "hadoop";
        //true
        System.out.println(str4 == str5);
    }

    /**
     * 体会执行效率
     */
    @Test
    public void test06(){
        long start = System.currentTimeMillis();

        //花费的时间为： 8433
        //method01(100000);
        //花费的时间为： 7
        method02(100000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为： " + (end - start));
    }

    public static void method01(int highLevel) {
        String src = "";
        for (int i = 0; i < highLevel; i++) {
            // 每次循环都会创建一个StringBuilder对象
            src += "a";
        }
    }

    public static void method02(int highLevel) {
        //只需要创建一个StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < highLevel; i++) {
            sb.append("a");
        }
    }

}
