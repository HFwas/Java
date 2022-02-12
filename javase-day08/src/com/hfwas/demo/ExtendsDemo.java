package com.hfwas.demo;

/**
 * @Author: HFwas
 * @Date: 2020/12/13
 * @Description: 继承
 * 在继承的关系中，"子类就是一个父类"，也就是说，子类可以被当作父类看待
 * 例如父类时员工，子类时讲师，那么"讲师就是一个员工"。关系：is-a
 *
 * 定义父类的格式：(一个普通的类定义)
 * public class 父类名称{
 *
 * }
 *
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 *      1.直接通过子类对象访问成员变量：等号左边是谁，就优先用谁，没有则向上找
 *      2.间接通过成员方法访问成员变量：该方法属于谁，就优先用谁，没有则向上找
 * 局部变量：            直接写成员变量名
 * 本类的成员变量：       this.成员变量名
 * 父类的成员变量：       super.成员变量名
 *
 * 在父子类的继承关系中，创建子类对象，访问成员方法的规则：创建的对象是谁，就优先用谁，如果没有则向上找
 * 注意事项：
 *      无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的
 * 重写(override)：
 * @version: 1.0
 */
public class ExtendsDemo {

    public static void main(String[] args) {
        //创建对象
        Teacher teacher = new Teacher();
        //Teacher类虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();

        Assistant a = new Assistant();
        a.method();

        Father father = new Father();
        //10
        System.out.println(father.numFu);

        Son son = new Son();
        //20
        System.out.println(son.numZi);
        //10
        System.out.println(son.numFu);
        //30
        System.out.println(son.num);

        //该方法是子类的，优先使用子类的，没有则向上找
        son.methodZi();
        //该方法在父类当中定义的，
        son.methodFu();
    }


}
