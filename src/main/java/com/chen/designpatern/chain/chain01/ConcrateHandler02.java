package com.chen.designpatern.chain.chain01;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class ConcrateHandler02 extends AbstractHandler implements Handler {

    @Override
    public boolean handle() {
        System.out.println("ConcrateHandler02 处理");
        return false;
    }

    @Override
    public boolean handleRequest() {
        return false;
    }

}
