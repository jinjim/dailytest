package com.chen.proxy.staticproxy;

/**
 * @author liang.chen
 * @date 2016-12-17
 */
public class HouseMaster implements Rent {

    @Override
    public void rent(String desc) {
        System.out.println("post rent:" + desc);
    }
}
