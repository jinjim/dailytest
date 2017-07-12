package com.chen.date.joda;

import com.alibaba.fastjson.JSON;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liang.chen
 * @date 2016-12-06
 */
public class JodaTest001 {
    public static void main(String[] args) {
//        java.util.Date juDate = new Date();
//        DateTime dt = new DateTime(juDate);
//
//        int year = dt.getYear();
//        int month = dt.getMonthOfYear();
//        int day = dt.getDayOfMonth();
//        int hour = dt.getHourOfDay();
//        int minute = dt.getMinuteOfHour();
//        int second = dt.getSecondOfMinute();
//
//        System.out.println(JSON.toJSONString(month));


        System.out.println("============= DateTime ==================");

        Date date = new Date();

        // 用来替换JDK中的Canl对应于jdk中的date，有年月日，时分秒
        DateTime dt = new DateTime(date);
        Date newDate = dt.toDate();

        System.out.println("year   :" + dt.getMonthOfYear());
        System.out.println("month  :" + dt.getMonthOfYear());
        System.out.println("day    :" + dt.getDayOfMonth());
        System.out.println("hour   :" + dt.getHourOfDay());
        System.out.println("minute :" + dt.getMinuteOfHour());
        System.out.println("second :" + dt.getSecondOfMinute());
        System.out.println(dt.toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dt.toString("yyyy-MM-dd"));
//        DateTime year2000 = dt.withYear(2000);
        DateTime twoHoursLater = dt.plusHours(2);

        System.out.println(twoHoursLater.getYear());





        System.out.println("============= LocalDate ==================");

        // 顾名思义，日期，只有年月日，没有时分秒
        LocalDate localDate = new LocalDate();
        Date localDateToJDate = localDate.toDate();


        System.out.println("year :" + localDate.getMonthOfYear());
        System.out.println("month:" + localDate.getMonthOfYear());
        System.out.println("day  :" + localDate.getDayOfMonth());

        // 格式化是，只能格式化到日期，能不带时分秒
        System.out.println("localDate:"+localDate.toString("yyyy-MM-dd"));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("jdkDate:"+ sdf.format(localDateToJDate));
        System.out.println("jdkDate:"+ sdf.format(localDate.plusDays(1).toDate()));




        System.out.println("============== LocalTime =================");

        // 顾名思义，日期，只有年月日，没有时分秒
        LocalTime localTime = new LocalTime();
        Date localTimeToDate = localTime.toDateTimeToday().toDate();
        System.out.println("hour   :" + localTime.getHourOfDay());
        System.out.println("minute :" + localTime.getMinuteOfHour());
        System.out.println("second :" + localTime.getSecondOfMinute());

        // 格式化时只能格式化到时间，不能有年月日
        System.out.println("localTime:"+localTime.toString("HH:mm:ss"));



        System.out.println("============== LocalDateTime =================");

        // 顾名思义，日期，只有年月日，没有时分秒
        LocalDateTime localDateTime = new LocalDateTime();
        System.out.println("year   :" + localDateTime.getMonthOfYear());
        System.out.println("month  :" + localDateTime.getMonthOfYear());
        System.out.println("day    :" + localDateTime.getDayOfMonth());
        System.out.println("hour   :" + localDateTime.getHourOfDay());
        System.out.println("minute :" + localDateTime.getMinuteOfHour());
        System.out.println("second :" + localDateTime.getSecondOfMinute());

        // 格式化时只能格式化到时间，不能有年月日
        System.out.println("localDateTime:"+localDateTime.toString("yyyy-MM-dd HH:mm:ss"));





    }
}
