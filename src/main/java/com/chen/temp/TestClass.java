package com.chen.temp;

import com.alibaba.fastjson.JSON;
import com.chen.hcbxmlstream.Student;

/**
 * @author liang.chen
 * @create 2016-10-17
 */
public class TestClass extends ParentClass {

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        Student student = new Student();
        student.setScore(200);
        student.setId("12");

        Student student1 = tc.printStudent(student);

        System.out.println("dd:" + JSON.toJSONString(student1));
    }

    @Override
    protected Student printStudent(Student student) {
        student.setId("2");
        student.setScore(300);
        System.out.println(JSON.toJSONString(student));
        return student;
    }

}
