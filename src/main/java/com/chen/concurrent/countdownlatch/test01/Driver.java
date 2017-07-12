package com.chen.concurrent.countdownlatch.test01;

import java.util.concurrent.CountDownLatch;

public class Driver {

    public static void main(String[] args) throws Exception {

        int count = 10;

        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(count);

        for (int i = 0; i < count; ++i) {// create and start threads
            new Thread(new Worker(startSignal, doneSignal)).start();
        }

        System.out.println("001");            // don't let run yet


        startSignal.countDown();      // let all threads proceed

        doneSignal.await();           // wait for all to finish

        System.out.println("002");

    }



}


