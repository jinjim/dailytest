package com.chen.spring.context;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
public class CatDispoableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {    // 销毁是执行的方法
        System.out.println("===========CatDispoableBean=============");
    }
}
