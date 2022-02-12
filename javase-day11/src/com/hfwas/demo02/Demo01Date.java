package com.hfwas.demo02;

import java.util.Date;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo02
 * java.util.Date:表示日期和时间的类
 *     类 Date 表示特定的瞬间，精确到毫秒。
 *     毫秒:千分之一秒 1000毫秒=1秒
 *     特定的瞬间:一个时间点,一刹那时间
 *     2088-08-08 09:55:33:333 瞬间
 *     2088-08-08 09:55:33:334 瞬间
 *     2088-08-08 09:55:33:334 瞬间
 *     ...
 *     毫秒值的作用:可以对时间和日期进行计算
 *     2099-01-03 到 2088-01-01 中间一共有多少天
 *     可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期
 *
 *     把日期转换为毫秒:
 *         当前的日期:2088-01-01
 *         时间原点(0毫秒):1970 年 1 月 1 日 00:00:00(英国格林威治)
 *         就是计算当前日期到时间原点之间一共经历了多少毫秒 (3742767540068L)
 *     注意:
 *         中国属于东八区,会把时间增加8个小时
 *         1970 年 1 月 1 日 08:00:00
 *
 *     把毫秒转换为日期:
 *         1 天 = 24 × 60 × 60 = 86400 秒  = 86400 x 1000 = 86400000毫秒
 * @version: 1.0
 */
public class Demo01Date {

    public static void main(String[] args) {
        //获取系统时间到系统原点经历了多少毫秒：1970 年 1 月 1 日 00:00:00
        //1609483743114
        System.out.println(System.currentTimeMillis());

        //获取当前系统时间
        Date date = new Date();
        //Fri Jan 01 14:51:39 CST 2021
        System.out.println(date);

        //传递毫秒值，将毫秒值转换成date日期
        Date date1 = new Date(0L);
        //Thu Jan 01 08:00:00 CST 1970
        System.out.println(date1);

        Date date2 = new Date(154648345L);
        //Sat Jan 03 02:57:28 CST 1970
        System.out.println(date2);

        //1609484507371
        //表示从Fri Jan 01 15:01:47 CST 2021到Thu Jan 01 08:00:00 CST 1970的毫秒数
        Date date3 = new Date();
        System.out.println(date3.getTime());
    }

}
