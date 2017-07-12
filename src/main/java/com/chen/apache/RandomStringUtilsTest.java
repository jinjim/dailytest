package com.chen.apache;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author liang.chen
 * @date 2016-12-12
 */
public class RandomStringUtilsTest {

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomAlphanumeric(10));
        System.out.println(RandomStringUtils.randomAlphabetic(10));
    }
}
