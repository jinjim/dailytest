package com.chen.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
public class AnnotationConfigClient02 {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.chen.spring.context");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
        System.out.println("================================================");

        System.out.println(context.getBean("user"));

        context.close();
    }
}
