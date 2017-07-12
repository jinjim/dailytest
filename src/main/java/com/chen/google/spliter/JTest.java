package com.chen.google.spliter;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

/**
 * @author liang.chen
 * @date 2017-02-23
 */
public class JTest {

    public static void main(String[] args) {

        String str = ",s1=33,s2=dd,,S5=33,,,,";

        List<String> list = Splitter.on(",").splitToList(str);
        System.out.println(RandomStringUtils.randomAlphanumeric(32));
    }
}
