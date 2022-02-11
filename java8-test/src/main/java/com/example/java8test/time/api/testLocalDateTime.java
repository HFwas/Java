package com.example.java8test.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @Author HFwas
 * @Date 2022/2/10 11:41
 */
public class testLocalDateTime {
    public static void main(String[] args) {
//        testLocalDateTime();
        testLocalDateTime2();
    }

    private static void testLocalDateTime2() {
        LocalDateTime now = LocalDateTime.now();
        // 2022-02-10T11:45:56.957
        System.out.println(now);

        // 2022-02-10
        System.out.println(now.toLocalDate());
        // 11:46:27.448
        System.out.println(now.toLocalTime());

        LocalTime localTime = now.toLocalTime();
        // 42508
        System.out.println(localTime.toSecondOfDay());
        // 86000000: 11
        System.out.println(localTime.getNano() + ": " + localTime.getHour());
    }

    public static void testLocalDateTime(){
    // 获取当前的日期时间
    LocalDateTime currentTime = LocalDateTime.now();
    // 当前时间: 2022-02-10T11:43:42.865
    System.out.println("当前时间: " + currentTime);

    LocalDate date1 = currentTime.toLocalDate();
    // date1: 2022-02-10
    System.out.println("date1: " + date1);

    Month month = currentTime.getMonth();
    int day = currentTime.getDayOfMonth();
    int seconds = currentTime.getSecond();
    // 月: FEBRUARY, 日: 10, 秒: 42
    System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

    LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
    // date2: 2012-02-10T11:43:42.865
    System.out.println("date2: " + date2);

    // 12 december 2014
    LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
    // date3: 2014-12-12
    System.out.println("date3: " + date3);

    // 22 小时 15 分钟
    LocalTime date4 = LocalTime.of(22, 15);
    // date4: 22:15
    System.out.println("date4: " + date4);

    // 解析字符串
    LocalTime date5 = LocalTime.parse("20:15:30");
    // date5: 20:15:30
    System.out.println("date5: " + date5);
}
}
