package com.chen.google.guava.cache;

import com.google.common.cache.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class CacheOfGenericTest002 {

    private static Cache<String, String> cacheFormCallable = null;

    public static void main(String[] args) throws Exception {
        CacheOfGenericTest002 cgt = new CacheOfGenericTest002();

        final String u1name = "peida";
        final String u2name = "jerry";
        final String u3name = "lisa";

        cacheFormCallable = callableCached();



        System.out.println("peida:" + cgt.getCallableCache(u1name));
        System.out.println("jerry:" + cgt.getCallableCache(u2name));
        System.out.println("lisa:" + cgt.getCallableCache(u3name));
        cacheFormCallable.put("peida", "cc");
        System.out.println("peida:" + cgt.getCallableCache(u1name));
        Thread.currentThread().sleep(3000);

        System.out.println("jerry:" + cgt.getCallableCache(u2name));
    }


    /**
     * 对需要延迟处理的可以采用这个机制；(泛型的方式封装)
     *
     * @param <K>
     * @param <V>
     * @param key
     * @param callable
     * @return V
     * @throws Exception
     */
    public static <K, V> Cache<K, V> callableCached() throws Exception {
        Cache<K, V> cache = CacheBuilder
                .newBuilder()
                .maximumSize(10000)
                .expireAfterWrite(2, TimeUnit.SECONDS)
                .build();
        return cache;
    }



    private String getCallableCache(final String userName) {
        try {
            //Callable只有在缓存值不存在时，才会调用
            return cacheFormCallable.get(userName, new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println(userName + " from db");
                    return "hello " + userName + "!";
                }
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
