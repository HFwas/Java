package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * 说明早期绑定和晚期绑定的一个例子
 * @version: 1.0
 */
public class AnimalTest {
    public void showAnimal(Animal animal){
        //表现：晚期绑定
        animal.eat();
    }

    public void showHuntable(Huntable huntable){
        //表现：晚期绑定
        huntable.hunt();
    }
}

class Dog extends Animal implements Huntable{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("捕食耗子，多管闲事");
    }
}

class Cat extends Animal implements Huntable{

    public Cat(){
        //表现为：早期绑定
        super();
    }

    public Cat(String name){
        //表现为：早期绑定
        this();
    }

    @Override
    public void eat() {
        ////表现为：早期绑定
        super.eat();

        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("捕食耗子，天经地义");
    }
}

interface Huntable{
    void hunt();
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
}
