package com.chen.google.guava.maps;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Map;
import java.util.Set;

/**
 * Created by hcb on 2017-6-8.
 */
public class MapsTest {

    public static void main(String[] args) {
        User user01 = new User();
        user01.setName("1231");
        user01.setAddress("address01");
        user01.setAge(21);

        User user02 = new User();
        user02.setName("1232");
        user02.setAddress("address02");
        user02.setAge(22);

        User user03 = new User();
        user03.setName("1233");
        user03.setAddress("address03");
        user03.setAge(23);

        Set<User> set = ImmutableSet.of(user01, user02,user03);

        Map<String, User> map = Maps.uniqueIndex(set, new Function<User, String>() {
            @Override
            public String apply(User input) {
                return input.getName();
            }
        });

        System.out.println(JSON.toJSONString(map));

    }

}
