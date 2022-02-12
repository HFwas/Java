package com.hfwas.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo02
 * 练习:
 *         请使用日期时间相关的API，计算出一个人已经出生了多少天。
 *     分析:
 *         1.使用Scanner类中的方法next,获取出生日期
 *         2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
 *         3.把Date格式的出生日期转换为毫秒值
 *         4.获取当前的日期,转换为毫秒值
 *         5.使用当前日期的毫秒值-出生日期的毫秒值
 *         6.把毫秒差值转换为天(s/1000/60/60/24)
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        //1.使用Scanner类中的方法next,获取出生日期
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.next();
        //2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        //3.把Date格式的出生日期转换为毫秒值
        long time = date.getTime();
        //4.获取当前的日期,转换为毫秒值
        Date date1 = new Date();
        long time1 = date1.getTime();
        //5.使用当前日期的毫秒值-出生日期的毫秒值
        long time2 = time1 - time;
        //6.把毫秒差值转换为天(s/1000/60/60/24)
        System.out.println(time2/1000/60/60/24);
    }

}
