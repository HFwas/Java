package com.hfwas.demo02;

/**
 * @Author: HFwas
 * @Date: 2021/1/10
 * @Description: com.hfwas.demo02
 * 日志案例
 *
 *     发现以下代码存在的一些性能浪费的问题
 *     调用showLog方法,传递的第二个参数是一个拼接后的字符串
 *     先把字符串拼接好,然后在调用showLog方法
 *     showLog方法中如果传递的日志等级不是1级
 *     那么就不会是如此拼接后的字符串
 *     所以感觉字符串就白拼接了,存在了浪费
 * @version: 1.0
 */
public class Demo01Logger {
    public static void main(String[] args) {
        String message1 = "heelo";
        String message2 = "heelo";
        String message3 = "heelo";
        demo01(1,message1 + message2 + message3);

    }

    private static void demo01(int level,String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }
}
