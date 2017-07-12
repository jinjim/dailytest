package com.chen.concurrent.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class ApplicationStartupUtil {

    //List of service checkers
    private static List<BaseHealthChecker> serviceList;

    //This latch will be used to wait on
    private static CountDownLatch latch;

    private ApplicationStartupUtil()
    {
    }

    private final static ApplicationStartupUtil INSTANCE = new ApplicationStartupUtil();

    public static ApplicationStartupUtil getInstance()
    {
        return INSTANCE;
    }

    public static boolean checkExternalServices() throws Exception
    {
        //Initialize the latch with number of service checkers
        latch = new CountDownLatch(3);

        //All add checker in lists
        serviceList = new ArrayList<BaseHealthChecker>();
        serviceList.add(new NetworkHealthChecker(latch));
        serviceList.add(new CacheHealthChecker(latch));
        serviceList.add(new DatabaseHealthChecker(latch));

        //Start service checkers using executor framework
        Executor executor = Executors.newFixedThreadPool(serviceList.size());

        for(final BaseHealthChecker v : serviceList)
        {
            executor.execute(v);
        }

        //Now wait till all services are checked
        latch.await();
        System.out.println("===========1都执行完了=====");


        latch = new CountDownLatch(3);
        serviceList = new ArrayList<BaseHealthChecker>();
        serviceList.add(new NetworkHealthChecker(latch));
        serviceList.add(new CacheHealthChecker(latch));
        serviceList.add(new DatabaseHealthChecker(latch));
        for(final BaseHealthChecker v : serviceList)
        {
            executor.execute(v);
        }
        latch.await();
        System.out.println("===========2都执行完了=====");

        //Services are file and now proceed startup
        for(final BaseHealthChecker v : serviceList)
        {
            if( ! v.isServiceUp())
            {
                return false;
            }
        }
        return true;
    }
}
