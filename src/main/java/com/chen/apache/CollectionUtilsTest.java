package com.chen.apache;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liang.chen
 * @create 2016-10-14
 */
public class CollectionUtilsTest {
    public static void main(String[] args) {
        isEqualCollectionTest();
    }

    public static void isEqualCollectionTest(){
        List<String> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();
        List<String> list03 = new ArrayList<>();


        list01.add("05");

        list02.add("04");
        list02.add("06");
        list02.add("05");
        list02.add("07");

        list03.add("04");
        list03.add("05");
        list03.add("06");
        System.out.println("list01="+ JSON.toJSONString(list01));
        System.out.println("list02="+ JSON.toJSONString(list02));
        System.out.println("list03="+ JSON.toJSONString(list03));


        //
        // System.out.println("isSubCollection="+ JSON.toJSONString(CollectionUtils.isSubCollection(list01, list02)));
        //
        // list01.addAll(list02);
        // System.out.println("getCardinalityMap="+ JSON.toJSONString(CollectionUtils.getCardinalityMap(list01)));

        System.out.println("===================================================================");

        // 并集：集合1和集合2的并集，与集合1和2的参数位置无关
        System.out.println("union(list02, list01)="+ JSON.toJSONString(CollectionUtils.union(list01, list02)));

        // 交集：集合1和集合2的交集，与集合1和2的参数位置无关
        System.out.println("intersection(list02, list01)="+ JSON.toJSONString(CollectionUtils.intersection(list02, list01)));

        // 集合差：集合1和集合2的差。集合1减去集合1和集合2的交集，与集合1和集合2的位置有关系
        System.out.println("subtract(list02, list01)="+ JSON.toJSONString(CollectionUtils.subtract(list02, list01)));

        // 并集-交集：两个集合并集-交集，与俩集合参数位置无关
        System.out.println("disjunction(list02, list01)="+ JSON.toJSONString(CollectionUtils.disjunction(list01, list02)));

        System.out.println("list01==list02:" + CollectionUtils.isEqualCollection(list01, list02));
        System.out.println("list02==list03:" + CollectionUtils.isEqualCollection(list02, list03));

        System.out.println("===================================================================");

        List<String> list04 = new ArrayList<>();
        list04.add("06");
        list04.add("05");
        list04.add("07");
        System.out.println("list01="+ JSON.toJSONString(list04));

        String[] array04 = new String[list04.size()];
        array04 = list04.toArray(array04);
        System.out.println("array04="+ JSON.toJSONString(array04));


        List<String> arrayToList01 = new ArrayList<>();
        CollectionUtils.addAll(arrayToList01, array04);
        System.out.println("arrayToList01="+ JSON.toJSONString(arrayToList01));

        List<String> arrayToList02 = Arrays.asList(array04);
        System.out.println("arrayToList02="+ JSON.toJSONString(arrayToList02));
    }
}
