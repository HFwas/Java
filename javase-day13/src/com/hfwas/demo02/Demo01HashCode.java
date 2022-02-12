package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/3
 * @Description: com.hfwas.demo02
 * 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,
 *          不是数据实际存储的物理地址)
 *     在Object类有一个方法,可以获取对象的哈希值
 *     int hashCode() 返回该对象的哈希码值。
 *     hashCode方法的源码:
 *         public native int hashCode();
 *         native:代表该方法调用的是本地操作系统的方法
 * @version: 1.0
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person person1 = new Person();
        //460141958
        System.out.println(person1.hashCode());

        Person person2 = new Person();
        //1163157884
        System.out.println(person2.hashCode());

        /**
         * tostring方法的源码
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        //com.hfwas.demo02.Person@1b6d3586
        System.out.println(person1.toString());
        //com.hfwas.demo02.Person@4554617c
        System.out.println(person2.toString());
        System.out.println(person1 == person2);

        //字符串的hashcode方法
        String str1 = new String("abc");
        String str2 = new String("abc");
        //96354
        System.out.println(str1.hashCode());
        //96354
        System.out.println(str2.hashCode());

        //1179395
        System.out.println("重地".hashCode());
        //1179395
        System.out.println("通话".hashCode());
    }
}
