package com.hfwas.java1.chapter02;

/**
 * @Author: HFwas
 * @Date: 2021/1/31
 * @Description: com.hfwas.java1.chapter02
 * 指令7：空指转移指令
 * @version: 1.0
 */
public class IfSwitchGoToTest {
    // 1.条件跳转指令
    public void compare1(){
        int a = 0;
        if (a == 0){
            a = 10;
        }else {
            a = 20;
        }
    }

    public boolean compareNull(String str){
        if (str == null) {
            return true;
        }else{
            return false;
        }
    }

    // 结合比较指令
    public void compare2(){
        float f1 = 9;
        float f2 = 10;
        System.out.println(f1 < f2);
    }

    public void compare3(){
        int i1 = 10;
        long l2 = 20;
        System.out.println(i1 < l2);
    }

    public int compare4(double d){
        if (d > 50.0){
            return 1;
        }else{
            return -1;
        }
    }

    // 2.比较条件跳转指令
    public void ifCompare1(){
        int i = 10;
        int j = 20;
        System.out.println(i < j);
    }

    public void ifCompare2(){
        short s1 = 9;
        byte b1 = 10;
        System.out.println(s1 > b1);
    }

    public void ifCompare3(){
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1 == object2);
        System.out.println(object1 != object2);
    }

    // 3.多条件分支跳转
    public void switch1(int select){
        int num;
        switch (select){
            case 1:
                num = 10;
                break;
            case 2:
                num = 20;
                break;
            case 3:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    public void switch2(int select){
        int num;
        switch (select){
            case 100:
                num = 10;
                break;
            case 500:
                num = 20;
                break;
            case 300:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    //jdk7新特性，引入string类型
    public void switch3(String season){
        switch (season){
            case "SPRING":break;
            case "SUMER":break;
            case "AUTUME":break;
            case "WINTER":break;
        }
    }

    // 4.无条件跳转指令
    public void whileInt(){
        int i = 0;
        while(i < 100){
            String s = "hello";
            i++;
        }
    }

    public void whileDouble(){
        double d = 0.0;
        while (d < 100.1){
            String s = "hello";
            d++;
        }
    }

    public void printFor(){
        short i = 1;
        for (int j = 0; j < 100; j++) {
            String s = "hello hfwas";
        }
    }

    // 思考：如下两个方法的操作有何不同？？？
    public void whileTest(){
        int i = 1;
        while (i <= 100){
            i++;
        }
        // 可以继续使用i
    }

    public void forTest(){
        for (int i = 0; i < 100; i++) {

        }
        // 不可以继续使用i
    }

    // 更进一步
    public void doWhileTest(){
        int i = 1;
        do {
            i++;
        }while (i < 100);
    }
}
