package com.chen.google.guava;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

/**
 * @author liang.chen
 * @date 2016-11-15
 */
public class OrderingTest {
    public static void main(String[] args) {

        Ordering<String> ordering = new Ordering<String>() {
            @Override
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
    }
}
