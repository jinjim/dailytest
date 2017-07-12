package com.map.chen.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/18.
 */
public class JTest {


    @Test
    public void testMap() {
        Map<String, String> map = new HashMap<>(1);
//        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("3", "4");
        System.out.println("result=" + map);
    }

}
