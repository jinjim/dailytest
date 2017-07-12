package com.chen.apache;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liang.chen
 * @create 2016-10-14
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        // splitTest();
        // splitByWholeSeparatorTest();
        // endWithTest();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String str = "1900-01-01 00:00:00";

        try {
            Date date =  simpleDateFormat.parse(str);
            System.out.println("time:"+date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void splitTest(){
        String teststr = "127.0.0.1:8080:12:13";
        String[] arr = StringUtils.split(teststr, ":", 3);
        for (String s : arr) {
            System.out.println(s);
        }

        // 127.0.0.1
        // 8080
        // 12:13
    }

    private static void splitByWholeSeparatorTest(){
        String teststr = "127.0.0.1  ::  8080 12 13";
        String[] arr = StringUtils.splitByWholeSeparator(teststr, StringUtils.EMPTY);
        for (String s : arr) {
            System.out.println(s);
        }
        // throw new IllegalArgumentException(teststr + " is not a valid rent filter name");
        // 127.0.0.1
        // 8080
        // 12:13
    }

    private static void endWithTest(){
        // String testStr = "1E343434LO";
        String testStr = "LO";
        System.out.println("result:" + !StringUtils.endsWith(testStr, "LO"));
    }
}
