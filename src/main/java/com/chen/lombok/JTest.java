package com.chen.lombok;

import com.alibaba.fastjson.JSON;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liang.chen
 * @date 2016-12-01
 */
public class JTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100);
        student.setName("ddd");
        student.setIdentity("sdfd");

        System.out.println(student.getName());

        System.out.println(JSON.toJSONString(student));
    }
}
