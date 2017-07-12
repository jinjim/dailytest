package com.chen.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by Administrator on 2017/7/5.
 */
public class Jtest {

    public static void main(String[] args) {

        Map<String, User> userMap = Maps.newHashMap();
        User user01 = new User();
        user01.setName("001");
        user01.setId(1);

        User user02 = new User();

        user02.setName("002");
        user02.setId(2);

        User user03 = new User();
        user01.setName("003");
        user01.setId(3);

        userMap.put(user01.getName(), user01);
        userMap.put(user02.getName(), user02);
        userMap.put(user03.getName(), user03);
        String json = JSON.toJSONString(userMap);
        System.out.println("json=" + json);

        Map<String, User> userMap1 = JSON.parseObject(json, new TypeReference<Map<String, User>>() {});

//        Map<String, User> userMap1 = JSON.parseObject(json, Map.class);


        System.out.println("=====");

        User user = userMap1.get("001");

//        System.out.println("user01.name=" + user.getName());

    }

}
