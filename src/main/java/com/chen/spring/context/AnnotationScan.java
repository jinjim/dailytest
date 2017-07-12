package com.chen.spring.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

/**
 * @author liang.chen
 * @date 2016-11-19
 */
@ComponentScan(basePackages = "com.chen.spring.context", excludeFilters = @Filter(type= FilterType.ASSIGNABLE_TYPE, classes=User.class))
public class AnnotationScan {

}
