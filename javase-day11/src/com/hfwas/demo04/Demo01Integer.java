package com.hfwas.demo04;

/**
 * @Author: HFwas
 * @Date: 2021/1/2
 * @Description: com.hfwas.demo04
 * 装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
 *         构造方法:
 *             Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
 *             Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 *                 传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
 *         静态方法:
 *             static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
 *             static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
 *     拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
 *         成员方法:
 *             int intValue() 以 int 类型返回该 Integer 的值。
 * @version: 1.0
 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        //构造方法
        Integer integer = new Integer(1);
        //1
        System.out.println(integer);
        Integer integer1 = new Integer("1");
        //1
        System.out.println(integer1);

        //静态方法
        Integer integer2 = Integer.valueOf("1");
        //1
        System.out.println(integer2);

        //NumberFormatException:数字格式化异常
//        Integer a = Integer.valueOf("a");
//        System.out.println(a);

        Integer integer3 = Integer.valueOf(1);
        //1
        System.out.println(integer3);

        //拆箱：在包装类中取出基本数据类型
        int i = integer.intValue();
        System.out.println(i);


    }
}
