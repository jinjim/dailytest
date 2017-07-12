package com.guava.chen.test.sipltter;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SplitterTest {

    @Test
    public void testToList () {
        String str = ",s1=33,s2=dd,,S5=33,,,,";
        List<String> list = Splitter.on(",").splitToList(str);
        System.out.println("result=" + JSON.toJSONString(list));
    }

    @Test
    public void testSpiltByPattern () {
        String str = ",s1=t1+33,s2=dd,,S5=33,,,,";
        List<String> list = Splitter.on(Pattern.compile("[,=+]")).splitToList(str);
        System.out.println("result=" + JSON.toJSONString(list));
    }

    @Test
    public void testToMap () {
        String str = "s1=t1+33,s2=dd,S5=33,";
        Map<String, String> map = Splitter.on(",").omitEmptyStrings().trimResults().withKeyValueSeparator("=").split(str);
        System.out.println("result=" + JSON.toJSONString(map));
    }

    @Test
    public void testTo () {
        String str = "s1=t1+33,s2=dd,S5=33,";
         Iterable<String> iterator = Splitter.on(",").omitEmptyStrings().trimResults().split(str);
        List<String> list = Lists.newArrayList(iterator);
    }

}
