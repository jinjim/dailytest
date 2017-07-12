package com.chen.proxy.dynamicproxy;

import com.chen.proxy.staticproxy.HouseMasterProxy;

/**
 * @author liang.chen
 * @date 2016-12-17
 */
public class ClientTest {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();
        RentProxy rentProxy = new RentProxy(houseMaster);
        Rent rent = (Rent) rentProxy.getProxy();
        rent.rent("动态代理");
    }
}
