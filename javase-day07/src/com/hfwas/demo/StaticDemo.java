package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: static 关键字
 * 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 * 一旦使用static修饰成员方法，那么这就称为了静态方法，静态方法不再属于对象，而是属于类的
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 *
 * 无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
 *      静态变量：类名称.静态变量;
 *      静态方法:类名称.静态方法();
 * 注意事项：
 *      1.静态只能直接访问静态，不能直接访问非静态
 *      2.
 * 静态代码块：
 *      特点：当第一次用到本类时，静态代码块执行唯一的一次
 *      静态内容总是优先于非晶态
 * @version: 1.0
 */
public class StaticDemo {

    public static void main(String[] args) {
        Student one = new Student("one",16);
        Student.room = "101教室";
        Student two = new Student("two",18);

        System.out.println(one.getId() + " "+ one.getName() + " " + one.getAge() + " " + Student.room);
        System.out.println(two.getId() + " " + two.getName() + " " + two.getAge() + " " + Student.room);

        MyClass myClass = new MyClass();
        //然后才能使用没有static关键字的内容
        myClass.method();

        //对于静态方法来说，可以通过对象名来进行调用，也可以直接通过类名来调用
        //正确，但是不推荐
//        myClass.methodStatic();

        //正确，推荐
        MyClass.methodStatic();

        myMethod();
        //myThod()等价于下边这个方法
        StaticDemo.myMethod();

    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }

}
