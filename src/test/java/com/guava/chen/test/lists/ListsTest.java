package com.guava.chen.test.lists;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.*;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/18.
 */
public class ListsTest {

    @Test
    public void testMapsUniqueIndex () {
        User user01 = new User(1, "name1");
        User user02 = new User(2, "name2");

        List<User> list = ImmutableList.of(user01, user02);

        // 不可变map  ImmutableMap
        Map<Integer, User> map = Maps.uniqueIndex(list, new Function<User, Integer>() {
            @Override
            public Integer apply(User input) {
                return input.getId();
            }
        });
        System.out.println("result=" + JSON.toJSONString(map));
    }

    @Test
    public void testToList () {
        User user01 = new User(1, "name1");
        User user02 = new User(2, "name2");

        List<User> list = ImmutableList.of(user01, user02);
        HashMultimap<Integer, User> hashMultimap = HashMultimap.create();
        hashMultimap.putAll(1, list);
        System.out.println("result=" + JSON.toJSONString(hashMultimap));
    }

}
