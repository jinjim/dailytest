package com.chen.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * 多个排序条件测试
 * @author Winter Lau (http://my.oschina.net/javayou)
 * @date 2011-6-2 上午9:56:27
 */
public class Employee2 {
    private Date date;
	private String status;
	
	public Employee2(Date date, String status){
		this.date = date;
		this.status = status;
    }
	
    public static void main(String[] args) throws ParseException {
    	
        List<Employee2> objs = new ArrayList<Employee2>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        objs.add(new Employee2(sdf.parse("2016-06-9"), "BAD"));
        objs.add(new Employee2(sdf.parse("2016-06-10"), "OVERDUE"));
        objs.add(new Employee2(sdf.parse("2016-06-13"), "OVERDUE"));
        objs.add(new Employee2(sdf.parse("2016-06-9"), "OVERDUE"));
        objs.add(new Employee2(sdf.parse("2016-06-10"), "BAD"));
        objs.add(new Employee2(sdf.parse("2016-06-9"), "OVERDUE"));
        objs.add(new Employee2(sdf.parse("2016-06-9"), "UNREPAY"));
        objs.add(new Employee2(sdf.parse("2016-06-23"), "OVERDUE"));
        objs.add(new Employee2(sdf.parse("2016-06-12"), "BAD"));
        objs.add(new Employee2(sdf.parse("2016-06-9"), "UNREPAY"));

        Collections.sort(objs, new Comparator<Employee2>(){
            @Override
            public int compare(Employee2 a1, Employee2 a2) {
            	int order = 0;
            	int val = a1.status.compareTo(a2.status);
            	if(0 != val){
            		order = (val > 0) ? 1 : -1;
            	}else{
            		val = a1.date.compareTo(a2.date);
            		if(0 != val){
            			order = (val > 0) ? 1 : -1;
            		}
            	}
            	
            	return order;
            }       
        });
        System.out.println("No\tLevel\tSalary\tYears\n=============================");
        for(Employee2 a : objs)
            System.out.printf("%s\t%s\n", a.status, sdf.format(a.date));
    }
}