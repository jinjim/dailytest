package com.chen.designpatern.chain;

import com.alibaba.fastjson.JSON;
import com.chen.designpatern.chain.impl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author liang.chen
 * @create 2016-10-29
 */
public class HanderSortList {

    public static void main(String[] args) {
        Handler handler01 = new Handler01();
        Handler handler02 = new Handler02();
        Handler handler03 = new Handler03();

        handler01.setName("hander01");
        handler01.setOrder(1);
        handler02.setName("hander02");
        handler02.setOrder(2);
        handler03.setName("hander03");
        handler03.setOrder(3);



        List<Handler> handlerList = new ArrayList<>();
        handlerList.add(handler02);
        handlerList.add(handler03);
        handlerList.add(handler01);

        // Comparator<Handler> comparator = new HanderCompator();
        // Collections.sort(handlerList, comparator);

        System.out.println("排序前:" + JSON.toJSONString(handlerList));
    }

}
