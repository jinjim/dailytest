package com.chen.concurrent.cyclicbarrier;

/**
 * @author liang.chen
 * @date 2017-03-17
 */
public class Grouper implements Runnable {
    @Override
    public void run() {
        System.out.println("============所有的选手都准备好了===============");
    }
}
