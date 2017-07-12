package com.chen.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author liang.chen
 * @date 2016-12-17
 */
public class RentProxy implements InvocationHandler {

    private Object target;  // 被代理类

    public RentProxy(Object target ) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //在通过反射执行方法前后可以添加相关逻辑
        System.out.println("param:" + Arrays.asList(args));
        return method.invoke(target, args);
    }
}
