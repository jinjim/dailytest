package com.chen.apache;

import org.apache.commons.lang3.tuple.ImmutablePair;

/**
 * @author liang.chen
 * @date 2016-11-18
 */
public class ImmutableTest {

    public static void main(String[] args) {


        ImmutablePair<String, String> immutablePair = new ImmutablePair("key", "vale");
        System.out.println( "left:"+ immutablePair.getLeft() + ", right=" + immutablePair.getRight());



    }

}
