package com.chen.designpatern.chain.chain01;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class HandlerClient {
    public static void main(String[] args) {
        ConcrateHandler01 concrateHandler01 = new ConcrateHandler01();
        ConcrateHandler02 concrateHandler02 = new ConcrateHandler02();

        concrateHandler01.setNextHandler(concrateHandler02);

        concrateHandler01.handle();
    }

}