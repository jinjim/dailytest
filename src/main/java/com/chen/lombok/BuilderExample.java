package com.chen.lombok;

import com.chen.lombok.bean.BuilderBean;

/**
 * @author liang.chen
 * @date 2017-01-16
 */
public class BuilderExample {

    public static void main(String[] args) {


        BuilderBean builderBean = BuilderBean.builder().name("chenliang").address("chengdu").build();
        System.out.println("name:" + builderBean.getName());
        System.out.println("address:" + builderBean.getAddress());

    }

}
