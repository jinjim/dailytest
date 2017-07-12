package com.chen.concurrent.semaphore;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class SemaphoreTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建一个计数阈值为5的信号量对象
        // 只能5个线程同时访问
        Semaphore semaphore = new Semaphore(2);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Runnable> taskList = Lists.newArrayList();

        taskList.add(new Thread(new Runner(semaphore, "1号选手")));
        taskList.add(new Thread(new Runner(semaphore, "2号选手")));
        taskList.add(new Thread(new Runner(semaphore, "3号选手")));
        taskList.add(new Thread(new Runner(semaphore, "4号选手")));
        taskList.add(new Thread(new Runner(semaphore, "5号选手")));
        taskList.add(new Thread(new Runner(semaphore, "6号选手")));
        taskList.add(new Thread(new Runner(semaphore, "7号选手")));

        for (Runnable task : taskList) {
            executor.submit(task);
        }

        System.out.println("====都起跑了===");

        executor.shutdown();
    }
}