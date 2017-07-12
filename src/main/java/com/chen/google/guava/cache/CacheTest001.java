package com.chen.google.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.Callable;

/**
 * @author liang.chen
 * @date 2016-11-17
 */
public class CacheTest001 {
    public static void main(String[] args) throws Exception {
//        testLoadingCache();
        testCallableCache();

    }


    public static void testLoadingCache() throws Exception{
        LoadingCache<String,String> cahceBuilder=CacheBuilder.newBuilder()
                .build(new CacheLoader<String, String>(){
                    @Override
                    public String load(String key) throws Exception {
                        String strProValue="hello "+key+"!";
                        return strProValue;
                    }

                });

        System.out.println("jerry value:"+cahceBuilder.apply("jerry"));
        System.out.println("jerry value:"+cahceBuilder.get("jerry"));
        System.out.println("peida value:"+cahceBuilder.get("peida"));
        System.out.println("peida value:"+cahceBuilder.apply("peida"));
        System.out.println("lisa value:"+cahceBuilder.apply("lisa"));
        cahceBuilder.put("harry", "ssdded");
        System.out.println("harry value:"+cahceBuilder.get("harry"));
    }

    public static void testCallableCache()throws Exception{
        Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(1000).build();

        // 如果没有缓存，则调用Callable 初始化一个，如果已近缓存了，则直接返回。
        String resultVal = cache.get("jerry", new Callable<String>() {
            public String call() {
                String strProValue="hello "+"jerry"+"!";
                System.out.println("jerry 第一次，未缓存");
                return strProValue;
            }
        });

        System.out.println("jerry value : " + resultVal);

        String resultVal2 = cache.get("jerry", new Callable<String>() {
            public String call() {
                String strProValue="hello2 "+"jerry"+"!";
                System.out.println("jerry 已经缓存");
                return strProValue;
            }
        });
        System.out.println("jerry value2 : " + resultVal2);


        resultVal = cache.get("peida", new Callable<String>() {
            public String call() {
                String strProValue="hello "+"peida"+"!";
                return strProValue;
            }
        });
        System.out.println("peida value : " + resultVal);
    }
}
