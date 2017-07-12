package com.chen.concurrent.cas;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author liang.chen
 * @date 2016-11-26
 */
public class ABASingle {

    public static void main(String[] args) {
//        AtomicInteger atomicInt = new AtomicInteger(100);
//        atomicInt.compareAndSet(100, 101);
//        atomicInt.compareAndSet(101, 100);
//        System.out.println("new value = " + atomicInt.get());
//        boolean result1 = atomicInt.compareAndSet(100, 101);
//        System.out.println(result1); // result:true
//
//        AtomicInteger v1 = new AtomicInteger(100);
//        AtomicInteger v2 = new AtomicInteger(101);
//        AtomicStampedReference<AtomicInteger> stampedRef = new AtomicStampedReference<AtomicInteger>(v1, 3);
//
//        int stamp = stampedRef.getStamp();
//        System.out.println("initialStamp : " + stampedRef.getStamp());
//
//        System.out.println(stampedRef.compareAndSet(v1, v2, stampedRef.getStamp(), stampedRef.getStamp() + 1));
//
//        System.out.println("v1 -> v2 001 : " + stampedRef.getStamp());
//
//        System.out.println(stampedRef.compareAndSet(v2, v1, stampedRef.getStamp(), stampedRef.getStamp() + 1));
//
//        System.out.println("v1 -> v2 002 : " + stampedRef.getStamp());
//
//        boolean result2 = stampedRef.compareAndSet(v1, v2, stamp, stamp + 1);
//
//        System.out.println(result2); // result:false

        String str01 = "str01";
        String str02 = "str02";

        AtomicStampedReference<String> stampedRef = new AtomicStampedReference<String>(str01, 0);

        int stamp = stampedRef.getStamp();
        System.out.println("initialStamp : " + stampedRef.getStamp() + ", value : " + stampedRef.getReference());

        System.out.println(stampedRef.compareAndSet(str01, str02, stamp, stampedRef.getStamp() + 1));

        System.out.println("v1 -> v2 001 : " + stampedRef.getStamp() + ", value : " + stampedRef.getReference());

        System.out.println(stampedRef.compareAndSet(str02, str01, stampedRef.getStamp(), stampedRef.getStamp() + 1));

        System.out.println("v1 -> v2 002 : " + stampedRef.getStamp() + ", value : " + stampedRef.getReference());

        boolean result2 = stampedRef.compareAndSet(str01, str02, stamp, stamp + 1);

        System.out.println(result2);

    }


}



