package com.chen.spring.context.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

/**
 * @author liang.chen
 * @date 2017-01-17
 */
public class SptringUitlsTest {

    public static void main(String[] args) {

        String CONFIG_LOCATION_DELIMITERS = ".,; \t\n";

        String test = "sdfsdf;123,23" +
                "\t\n tttt, 4.5 EFF GG";

        String[] arrar = StringUtils.tokenizeToStringArray(test, CONFIG_LOCATION_DELIMITERS);

        System.out.println(JSON.toJSONString(arrar));

    }

}
