package com.hfwas.demo;

/**
 * @Auther: HFwas
 * @Date: 2020/12/8
 * @Description: switch
 * @version: 1.0
 */
public class Switch {
    /*
        switch(){
            case 常量值1:
                语句体1;
                break;
            case 常量值2;
                语句体2;
                break;
            .....
            default:
                语句体3;
                break;
        }
        注意事项：
            1.多个case后面的数值不能重复
            2.switch后面的小括号只能是下列数据类型：
                基本数据类型：byte/short/int/char
                引用数据类型：String字符串,enum枚举
            3.switch的格式可以很灵活：前后顺序可以颠倒，而且break可以省略
     */
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("数据错误");
                break;
        }

        //格式可以很灵活
        int num1 = 2;
        switch (num1){
            case 2://case顺序可以颠倒
                System.out.println("2");//break可以省略
            case 1:
                System.out.println("1");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("都会执行");
                break;
        }
    }

}
