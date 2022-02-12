package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo01
 * 当final关键字用来修饰一个类的时候，格式:
 * public final class 类名称{
 *     //.....
 * }
 *
 * 含义：当前这个类不能有任何的子类，
 * 注意：
 *      1.一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写(因为没儿子)
 *      2.对于类,方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 *      3.
 * @version: 1.0
 */
public final class MyClass /*extends Object*/{

    public void method(){
        System.out.println("父类方法执行");
    }

    //错误写法
    //抽象方法只能在抽象类里边
//    public abstract final void method1();

}
