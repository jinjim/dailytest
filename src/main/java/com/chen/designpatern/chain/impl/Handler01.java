package com.chen.designpatern.chain.impl;

import com.chen.designpatern.chain.AbstractHandler;
import com.chen.designpatern.chain.Handler;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class Handler01 extends AbstractHandler implements Handler {

    @Override
    public void calculate(Student student) {
        System.out.println("handler01 正在处理...");
    }


}
