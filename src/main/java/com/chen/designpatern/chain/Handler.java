package com.chen.designpatern.chain;

import com.chen.designpatern.chain.impl.Student;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public interface Handler {

    void handle(Student student);

     String getName();

     void setName(String name);

     int getOrder();

     void setOrder(int order);
}
