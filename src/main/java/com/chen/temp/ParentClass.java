package com.chen.temp;

import com.alibaba.fastjson.JSON;
import com.chen.hcbxmlstream.Student;

/**
 * @author liang.chen
 * @create 2016-10-19
 */
public class ParentClass {

    protected Student printStudent(Student student) {
        student.setId("2");
        student.setScore(100);
        System.out.println(JSON.toJSONString(student));
        return student;
    }
}
