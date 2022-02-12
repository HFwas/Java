package com.hfwas.demo;

import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2020/12/11
 * @Description: ArrayList
 *  注意：泛型只能是引用类型，不能是基本数据类型
 *  注意事项：
 *      1.对于ArrayList集合来说，直接打印得到的不是地址值，而是内容，如果内容为空，得到的是空的中括号：[]
 *      2.如果希望集合ArrayList当中存储基本类型数据，必须使用基本类型对应的"包装类"
 *  常用方法：
 *  基本类型    包装类
 *  int         Byte
 *  short       Short
 *  long        Integer
 *  float       Float
 *  double      Double
 *  char        Character
 *  boolean     Boolean
 *
 *  从JDK1.5开始，支持自动装箱，自动拆箱
 *  自动装箱：基本类型 -> 包装类型
 *  自动拆箱：包装类型 -> 基本类型
 * @version: 1.0
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);//[]

        //添加数据方法
        boolean isSuccess = list.add("a");
        System.out.println(isSuccess);//添加数据是否成功,true
        System.out.println(list);//[a]
        list.add("b");
        list.add("c");
        System.out.println(list);//[a,b,c]

        //获取元素方法
        String str1 = list.get(0);
        System.out.println(str1);//a

        //删除元素方法
        String str2 = list.remove(list.size() - 1);
        System.out.println(str2);//c

        //获取集合长度方法
        int length = list.size();
        System.out.println(length);

        //遍历集合
        for (int i = 0; i < length; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //生成6个1~33之间的随机整数，添加到集合，并遍历集合
        ArrayList<Integer> list2 = new ArrayList<>();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            list2.add(num);
        }
        //遍历集合
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }

}
