package com.chen.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsTest {
	public static void main(String[] args) throws ParseException {
		DateUtilsTest dd =  new DateUtilsTest();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		
//		Date date1 = DateUtils.addDays(sdf.parse("2016-11-13"), 3);
//		Date date2 = sdf.parse("2016-12-12");
//		
//		System.out.println(date1.compareTo(date2));
//		
//		System.out.println(DateUtils.truncatedCompareTo(date1, date2, Calendar.DAY_OF_MONTH));
//		System.out.println(DateUtils.truncatedEquals(date1, date2, Calendar.DAY_OF_MONTH));
//		
//		System.out.println(sdf.format(new Date(Long.valueOf("1471587704000"))));
//		
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date testDate =  DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH);
//		System.out.println(sdf2.format(testDate));
//		
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(sdf.parse("2016-12-12"));
//		calendar.set(5, calendar.getActualMaximum(5)+1);  
//		
//		System.out.println(sdf2.format(calendar.getTime()));
//		
//		AtomicInteger SEQ_ATOMIC_INTEGER = new AtomicInteger(1); // 序列变量
//		System.out.println(SEQ_ATOMIC_INTEGER.incrementAndGet());
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date td = sdf.parse("2016-01-01 12:12:12");
//		Date date = dd.addDays(td, -0);
//		String datestr = dd.formatDate(date, "yyyy-MM-dd");
//		System.out.println(datestr);
		
		
		String[] sourceCreditArray = "GYYH".split(",");
		for (String key : sourceCreditArray) {
            if(key == null || key ==""){
                System.out.println("提额");
            }
            if (key.equals("GYYH")) {
            	System.out.println("提额2");
            }
        }
	}
	
	
	public Date addDays(Date paramDate, int paramInt) {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTime(paramDate);
        int i = localCalendar.get(6);
        localCalendar.set(6, i + paramInt);
        return localCalendar.getTime();
    }
	
	public String formatDate(Date paramDate, String parttern) {
        if (paramDate == null)
            return null;
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(parttern);
        localSimpleDateFormat.setLenient(false);
        return localSimpleDateFormat.format(paramDate);
    }
	
}
