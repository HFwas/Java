package com.hfwas.demo01;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo01
 * 函数式接口的使用:一般可以作为方法的参数和返回值类型
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        //调用method方法,方法的参数是一个接口,所以可以传递接口的实现类对象
        demo01(new MyFunctionalInterfaceImpl());

        //调用method方法,方法的参数是一个接口,所以我们可以传递接口的匿名内部类
        demo01(new MyFunctionalInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类重写方法");
            }
        });

        //调用method方法,方法的参数是一个函数式接口,所以我们可以Lambda表达式
        demo01(()->{
            System.out.println("使用Lambda表达式");
        });

        demo01(()-> System.out.println("简化版Lambda表达式"));
    }

    private static void demo01(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method1();
    }
}
