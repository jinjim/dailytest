package com.chen.proxy.staticproxy;

/**
 * @author liang.chen
 * @date 2016-12-17
 */
public class HouseMasterProxy implements Rent {

    private Rent userService;

    public HouseMasterProxy(Rent userService){
        this.userService = userService;
    }

    @Override
    public void rent(String desc) {
        before();
        this.userService.rent(desc);
        after();
    }

    private void before(){
        System.out.println("before rent");
    }

    private void after() {
        System.out.println("after rent");
    }
}
