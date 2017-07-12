package com.chen.lombok.val;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liang.chen
 * @date 2016-12-14
 */
public class ValExample {

    public String example() {

        val ten = 10;
        System.out.println(ten == 10);

        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public void example2() {
//        val map = new HashMap<Integer, String>();
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        ValExample valExample = new ValExample();
        valExample.example();
        valExample.example2();
    }

}
