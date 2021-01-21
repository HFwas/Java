package com.hfwas.java.chapter05;

/**
 * @Author: HFwas
 * @Date: 2021/1/21
 * @Description: com.hfwas.java.chapter05
 * 体会invokedynamic指令
 * @version: 1.0
 */
public class Lambda {
    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        //invokedynamic
        Func func = s -> {
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s ->{
            return true;
        });
    }
}

@FunctionalInterface
interface Func{
    boolean func(String s);
}
