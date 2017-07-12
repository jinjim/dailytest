package com.chen.date.joda;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liang.chen
 * @date 2016-12-07
 */
public class DateTimeTest01 {

    public static void main(String[] args) {
        DateTime dt = new DateTime(new Date());
        DateTime year2000 = dt.withYear(2000).withMonthOfYear(3).withDayOfMonth(5)
                              .withHourOfDay(12).withMinuteOfHour(22).withSecondOfMinute(12);
        System.out.println(year2000.toString("yyyy-MM-dd HH:mm:ss"));

        DateTime twoHoursLater = dt.plusYears(2);

        System.out.println("year:" + dt.getYear());
        System.out.println("withYear:" + year2000.getYear());
        System.out.println("plusYears:" + twoHoursLater.getYear());

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("sdf:" + sdf.format(date));
        System.out.println("dateTime:" + new DateTime().toString("yyyy-MM-dd HH:mm:ss"));

    }

}
