package com.chen.date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Jtest {


    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

	public static void main(String[] args) throws ParseException {
		Jtest j = new Jtest();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		String s=sdf.format(new Date());
//		System.out.println(s);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date paramDate1 = sdf.parse("2016-06-08 10:22:11");
//		Date paramDate2 = sdf.parse("2016-06-09 10:20:11");
//
////		int count = j.calculateDaysBetweenDate(paramDate1, paramDate2)+1;
//
//		System.out.println(paramDate1.getTime() <= paramDate2.getTime());

//        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        Date originBeginTime   = localSimpleDateFormat.parse("2016-10-10 00:00:00");
//        Date originEndTime     = localSimpleDateFormat.parse("2016-12-03 23:59:59");
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(originEndTime);
//        calendar.add(Calendar.MONTH, -3);
//        Date newBeginTime = calendar.getTime();
//
//        if(newBeginTime.compareTo(originBeginTime) < 0 ){
//            System.out.println("超时了");
//        }else {
//            System.out.println("ok");
//        }

//        Date date = new Date();
//
//        Date nextDate = DateUtils.addDays(DateUtils.truncate(date, Calendar.DAY_OF_MONTH), 1);
//        System.out.println("nextDate:" + localSimpleDateFormat.format(nextDate));
//
//        if(date.compareTo(nextDate) < 0 ){
//            System.out.println("date < nextDate");
//        }else{
//            System.out.println("date >= nextDate");
//        }





	}
	
//	public int calculateDaysBetweenDate(Date paramDate1, Date paramDate2) throws ParseException {
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		paramDate1 = sdf.parse(sdf.format(paramDate1));
//		paramDate2 = sdf.parse(sdf.format(paramDate2));
//
//        Calendar localCalendar1 = Calendar.getInstance();
//        Calendar localCalendar2 = Calendar.getInstance();
//        localCalendar1.setTime(paramDate1);
//        localCalendar2.setTime(paramDate2);
//        if (localCalendar1.after(localCalendar2)) {
//            return -1;
//        }
//        int i = localCalendar2.get(6) - localCalendar1.get(6);
//        int j = localCalendar2.get(1);
//        if (localCalendar1.get(1) != j) {
//            localCalendar1 = (Calendar) localCalendar1.clone();
//            do {
//                i += localCalendar1.getActualMaximum(6);
//                localCalendar1.add(1, 1);
//            } while (localCalendar1.get(1) != j);
//        }
//        return i;
//    }
}
