package com.chen.designpatern.chain;

import com.chen.designpatern.chain.impl.Student;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public abstract class AbstractHandler implements Handler, Comparable<Handler> {

    @Override
    public int compareTo(Handler o) {
        return getOrder() - o.getOrder();
    }

    private String  name;

    private int     order;

    public Handler  nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Student student) {
        if (StringUtils.isBlank(student.getResult())) {
            calculate(student);
        }

        if (StringUtils.isBlank(student.getResult()) && getNextHandler() != null) {
            getNextHandler().handle(student);
        } else {
            System.out.println("没有可以处理的hander");
        }

    }

    public abstract void calculate(Student student);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


}
