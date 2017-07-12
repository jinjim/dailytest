package com.chen.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class NetworkHealthChecker extends BaseHealthChecker {

    public NetworkHealthChecker (CountDownLatch latch)  {
        super("Network Service", latch);
    }

    @Override
    public void verifyService()
    {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(7000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }

}
