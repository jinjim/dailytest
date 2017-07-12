package com.chen.designpatern.chain.impl;

import com.chen.designpatern.chain.AbstractHandler;
import com.chen.designpatern.chain.Handler;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class Handler02 extends AbstractHandler implements Handler {

    @Override
    public void calculate(Student student) {
        System.out.println("handler02 正在处理...");
        // System.out.println("handler02 处理成功...");
        // student.setResult("ok");
    }
}
