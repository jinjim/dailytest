package com.chen.concurrent.cyclicbarrier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class CyclicBarrierTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        //如果将参数改为4，但是下面只加入了3个选手，这永远等待下去
        //Waits until all parties have invoked await on this barrier.
        CyclicBarrier barrier = new CyclicBarrier(3, new Grouper());

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Runnable> taskList = new ArrayList<>();
        taskList.add(new Runner(barrier, "1号选手"));
        taskList.add(new Runner(barrier, "2号选手"));
        taskList.add(new Runner(barrier, "3号选手"));

        for (Runnable task : taskList) {
            executor.submit(task);
        }

//        List<Runnable> taskList2 = new ArrayList<>();
//        taskList2.add(new Runner(barrier, "4号选手"));
//        taskList2.add(new Runner(barrier, "5号选手"));
//        taskList2.add(new Runner(barrier, "6号选手"));
//
//        for (Runnable task : taskList2) {
//            executor.submit(task);
//        }

//        executor.submit(new Thread(new Runner(barrier, "1号选手")));
//        executor.submit(new Thread(new Runner(barrier, "2号选手")));
//        executor.submit(new Thread(new Runner(barrier, "3号选手")));

        executor.shutdown();
    }
}