package com.chen.designpatern.chain;

import com.chen.designpatern.chain.impl.Handler01;
import com.chen.designpatern.chain.impl.Handler02;
import com.chen.designpatern.chain.impl.Handler03;
import com.chen.designpatern.chain.impl.Student;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class HandlerTest {
    public static void main(String[] args) {
        Handler handler01 = new Handler01();

        Student student = new Student();
        handler01.handle(student);
    }
}
