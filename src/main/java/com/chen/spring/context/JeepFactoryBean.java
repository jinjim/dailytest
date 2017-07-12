package com.chen.spring.context;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
public class JeepFactoryBean implements FactoryBean<Jeep> {
    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
