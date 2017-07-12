package com.chen.test;

/**
 * @author liang.chen
 * @date 2016-10-30
 */
public abstract class AbstractHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("handler");
        calculate();
    }
}
