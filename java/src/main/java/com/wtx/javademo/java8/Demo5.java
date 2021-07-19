package com.wtx.javademo.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/8/18 13:13
 */
public class Demo5 {
    public static void main(String args[]){
        Demo5 java8tester = new Demo5();
        java8tester.testLocalDateTime();
    }

    public void testLocalDateTime(){

        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

//时间转字符串格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
        //字符串转时间
         String dateTimeStr = "2018-07-28 14:11:15";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime1 = LocalDateTime.parse(dateTimeStr, df);
        System.out.println(dateTime);
        System.out.println(dateTime1.toString().replaceAll("T"," "));

    }
}
