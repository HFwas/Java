package com.hfwas.demo05;

import java.util.function.Consumer;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo05
 * 练习:
 *         字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
 *         要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
 *         将打印性别的动作作为第二个Consumer接口的Lambda实例，
 *         将两个Consumer接口按照顺序“拼接”到一起。
 * @version: 1.0
 */
public class Demo03Test {
    public static void main(String[] args) {
        String[] str = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男"};
        exe(str,(message)->{
            String[] split = message.split(",");
            System.out.print("姓名：" + split[0] + "。");
        },(message)->{
            String[] split = message.split(",");
            System.out.print("年龄：" + split[1] + "。");
            System.out.println();
        });
    }

    private static void exe(String[] str, Consumer<String> con1,Consumer<String> con2) {
        for (String message : str) {
            con1.andThen(con2).accept(message);
        }
    }
}
