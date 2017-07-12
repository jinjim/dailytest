package com.chen.google.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;

import java.util.List;

/**
 * @author liang.chen
 * @date 2016-11-15
 */
public class IntsTest {

    public static void main(String[] args) {
        List<Integer> list = ImmutableList.of(1, 2, 3, 4);
        int[] array2 = Ints.toArray(list);
        System.out.println(JSON.toJSONString(array2));
    }

}
