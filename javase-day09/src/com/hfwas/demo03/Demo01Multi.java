package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/29
 * @Description: com.hfwas.demo03
 * 代码当中体现多态性，其实就是一句话，父类引用指向子类对象
 *
 * 格式：
 *      父类名称 对象名 = new 子类名称();
 * 或者：
 *      接口名称 对象名 = new 实现类名称();
 *
 * 访问成员变量的两种方式：
 *      1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上找
 *      2.间接通过成员方法访问
 *
 * 在多态的代码当中，成员方法的访问规则是：
 *      看new的是谁，就优先用谁，没有则向上找
 * 口诀：编译看左边，运行看右边
 * 成员方法：编译看左边，运行看左边
 * 成员变量：编译看左边，运行看右边
 * @version: 1.0
 */
public class Demo01Multi {

    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu fu = new Zi();

        fu.method();
        fu.methodFu();

        //10
        System.out.println(fu.num);

        //错误写法
//        System.out.println(fu.age);


        //子类没有覆盖重写，就是父：10
        //子类覆盖重写了，就是子：20
        fu.showNum();

        //父子都有，优先用子
        fu.method();
        //子没有，父类有，向上找到父类
        fu.methodFu();

        //编译看左边，左边是Fu，Fu当中没有methodZi()方法，所以编译报错
        //错误写法
//        fu.methodZi();


    }

}
