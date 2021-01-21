package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * @version: 1.0
 */
public class Son extends Father{
    public Son(){
        super();
    }

    public Son(int age){
        this();
    }

    // 不是重写的父类的方法，因为静态方法不能被重写
    public static void showStatic(String str){
        System.out.println("son : " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private " + str);
    }

    public void show(){
        //invokestatic
        showStatic("hello world");
        //invokestatic
        super.showStatic("good");
        //invokespecial
        showPrivate("hello");
        //invokespecial
        super.showCommon();

        // invokevirtual
        //因为此方法被final修饰，不能被子类重写，所以认为此方法是非虚方法
        showFinal();

        //虚方法如下：
        // invokevirtual
        showCommon();
        //invokespecial
        info();

        MethodInterface in = null;
        //invokeinterface
        in.methodA();
    }

    private void info() {

    }

    public void display(Father father){
        father.showCommon();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}

class Father{
    public Father(){
        System.out.println("father的构造器");
    }

    public static void showStatic(String string){
        System.out.println("father:" + string);
    }

    public final void showFinal(){
        System.out.println("father show final");
    }

    public void showCommon(){
        System.out.println("father普通方法");
    }
}
