package com.chen.proxy.staticproxy;

/**
 * @author liang.chen
 * @date 2016-12-17
 */
public class ClientTest {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();
        HouseMasterProxy houseMasterProxy = new HouseMasterProxy(houseMaster);
        houseMasterProxy.rent("静态代理实现方式");
    }
}
