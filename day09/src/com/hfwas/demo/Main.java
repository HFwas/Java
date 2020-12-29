package com.hfwas.demo;

/**
 * 接口就是多个类的公共规范。接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
 * 如何定义一个就扣的格式：
 * public interface 接口名称{
 *     //接口内容
 * }
 *
 * 备注：换成了interface之后，编译生成的字节码文件仍然是.java -> .class
 * 如果是java7，那么接口中可以包含的内容有：
 *      1.常量
 *      2.抽象方法
 * 如果是java8，那么接口中还可以包含的内容有：
 *      3.默认方法
 *      4.静态方法
 * 如果是java8，那么接口中可以包含的内容有：
 *      5.私有方法
 * 接口使用步骤：
 *  1.接口不能直接使用，必须有一个"实现类"实现该接口
 *  2.接口的实现类必须覆盖重写(实现)接口中的所有的抽象方法
 *      实现：去掉abstract关键字，加上方法体大括号
 *  3.创建实现类的对象，进行使用
 * 注意事项：
 *  1.如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
 *
 * 1.接口的默认方法，可以通过接口实现类对象，直接调用
 * 2.接口的默认方法，也可以被接口实现类进行覆盖重写
 *
 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
 * 正确用法：通过接口名称，直接调用其中的静态方法
 * 格式：
 *      接口名称.接口方法名（参数）；
 */
public class Main {

    public static void main(String[] args) {
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();
        myInterfaceAbstract.methodA();
        myInterfaceAbstract.methodB();
        myInterfaceAbstract.methodC();

        MyInterfaceDefaultA defaultA = new MyInterfaceDefaultA();
        //调用抽象方法，实际运行的是右侧实现类
        //这是抽象方法 AAA
        defaultA.method1();
        //调用默认方法，如果没有，则会向上找接口
        //这是默认的方法
        defaultA.methodDefault();

        MyInterfaceDefaultB defaultB = new MyInterfaceDefaultB();
        //这是抽象方法  BBB
        defaultB.method1();
        //实现类BB，这是覆盖重写了接口的默认方法
        defaultB.methodDefault();

        //测试接口中的静态方法
        //创建了实现类对象
        MyInterfaceStaticImpl aStatic = new MyInterfaceStaticImpl();
        //错误写法
//        aStatic.method();

        //直接通过接口名称来调用静态方法
        MyInterfaceStatic.method();


    }

}
