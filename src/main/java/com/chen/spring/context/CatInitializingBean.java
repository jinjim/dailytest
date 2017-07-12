package com.chen.spring.context;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
public class CatInitializingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {  // 状态设置时执行的方法
        System.out.println("===========CatInitializingBean=============");
    }
}
