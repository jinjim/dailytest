package com.chen.designpatern.chain.impl;

import com.chen.designpatern.chain.Handler;

import java.util.Comparator;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class HanderCompator implements Comparator<Handler> {
    @Override
    public int compare(Handler handler1, Handler handler2) {
        return handler1.getOrder() - handler2.getOrder();
    }
}
