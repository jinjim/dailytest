package com.chen.google.guava.collection;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.*;

import java.util.*;

import static com.google.common.base.Predicates.equalTo;

/**
 * @author liang.chen
 * @date 2016-11-16
 */
public class CollectionsTest {

    public static void main(String[] args) {
//        Map<String, String> maps  = Maps.newHashMap();
//        maps.put("1", "1");
//        maps.put("2", "2");
//        maps.put("3", "3");
//        for (Map.Entry<String, String> entry : maps.entrySet()){
//            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
//        }
//        List<String> list = Lists.newArrayList();

//        List<String> of = ImmutableList.of("a", "b", "c", "d");
//
//        for (String str : of ){
//            System.out.println(str);
//        }

//        Map<String, String> maps = ImmutableMap.of("a", "b", "c", "d", "e", "D");
//
//        for (Map.Entry<String, String> entry : maps.entrySet()){
//            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
//        }

//        List<String> list = ImmutableList.of("1", "2", "3", "4", "5");
//        String[] array2 = Chars.toArray(list);
//        System.out.println(JSON.toJSONString(array2));

//        String str2 = "key1: 1; key2: 2  ; key3: 3";
//        Iterable<String> m2 = Splitter.on(';').omitEmptyStrings()
//                .trimResults()
//                .split(str2);
//
//        List<String> list = Lists.newArrayList(m2);
//
//        System.out.println(JSON.toJSONString(list));
//
//        String str = "key1: 1; key2: 2  ; key3: 3";
//        Map<String, String> m = Splitter.on(';')
//                .trimResults()
//                .withKeyValueSeparator(":")
//                .split(str);
//
//        System.out.println(m);

//        List<String> list = Lists.newArrayList();
//        Map<String, String> map = Maps.newHashMap();
//        Set<String> set = Sets.newHashSet();

//        Map<String, String> maps = ImmutableMap.of("ON","TRUE","OFF","FALSE");
//        for (Map.Entry<String, String> entry : maps.entrySet()){
//            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
//        }


//        Table<Integer,Integer,String> personTable = HashBasedTable.create();
//
//        personTable.put(1,20,"01");
//        personTable.put(1,29,"01");
//        personTable.put(1,50,"01");
//        personTable.put(1,66,"01");
//
//        personTable.put(0,25,"01");
//        personTable.put(0,27,"01");
//        personTable.put(0,30,"01");
//        personTable.put(0,33,"01");
//
//        Map<Integer,String> rowMap= personTable.row(0);
//        for (Map.Entry<Integer, String> entry : rowMap.entrySet()){
//            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
//        }
//        int maxAge= Collections.max(rowMap.keySet());
//        System.out.println(maxAge);

//        List<Integer> list = ImmutableList.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
//        List<Integer> list2 =  ImmutableList.copyOf(Collections2.filter(list, new Predicate<Integer>() {
//            @Override
//            public boolean apply(Integer input) {
//                return input > 5;
//            }
//        }));
//
//        System.out.println(JSON.toJSONString(list2));


//        List<Integer> list = Lists.newArrayList();
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        List<Integer> list2 =  ImmutableList.copyOf(Collections2.filter(list, new Predicate<Integer>() {
//            @Override
//            public boolean apply(Integer input) {
//                return input >= 5;
//            }
//        }));
//         System.out.println(JSON.toJSONString(list2));

//        List<Integer> list3 = Lists.newArrayList(Collections2.filter(list, createPredicate()));
//        System.out.println("dd=" + (null == list3));
//        System.out.println(JSON.toJSONString(list3));

        Function<Integer, Integer> powerOfTwo = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer input) {
                return (int) Math.pow(input, 2);
            }
        };
        Set<Integer> lowNumbers = Sets.newHashSet(2, 3, 4);

        Map<Integer, Integer> numberToPowerOfTwoMuttable = Maps.asMap(lowNumbers, powerOfTwo);
        Map<Integer, Integer> numberToPowerOfTwoImuttable = Maps.toMap(lowNumbers, powerOfTwo);

        System.out.println();

    }

//    public static Predicate<Integer> createPredicate(){
//        return new Predicate<Integer>() {
//            @Override
//            public boolean apply(Integer input) {
//                return input >= 7;
//            }
//        };
//    }


}
