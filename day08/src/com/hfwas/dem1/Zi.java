package com.hfwas.dem1;

/**
 * @Author: HFwas
 * @Date: 2020/12/14
 * @Description: com.hfwas.dem1
 * @version: 1.0
 */
public class Zi extends Fu{

    public Zi(){
        //super(); //在调用父类无参构造方法

        //在调用父类重载的构造方法
        super(10);
        System.out.println("子类构造方法");
    }

    public void method1(){
//        super();//错误写法，只有子类构造方法才能调用父类的构造方法
    }

    @Override
    public String method(){
        System.out.println("子类方法");
        return null;
    }

}
