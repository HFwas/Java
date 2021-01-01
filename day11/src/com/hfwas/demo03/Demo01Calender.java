package com.hfwas.demo03;

import java.util.Calendar;

/**
 * @Author: HFwas
 * @Date: 2021/1/1
 * @Description: com.hfwas.demo03
 * java.util.Calendar类:日历类
 *     Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
 *     Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
 *     static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 * @version: 1.0
 */
public class Demo01Calender {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //java.util.GregorianCalendar[time=1609486354138,areFieldsSet=true.........
        System.out.println(calendar);
    }

}
