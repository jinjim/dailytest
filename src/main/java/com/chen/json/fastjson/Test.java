package com.chen.json.fastjson;

import com.alibaba.fastjson.JSON;
import com.chen.xmlstream.FunderUser;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author liang.chen
 * @date 2017-03-23
 */
public class Test {

    public static void main(String[] args) {
        String json = "{\"enableDisplayProduct\" : \"false\"}";
        FunderExtDO funderExtDO = JSON.parseObject(json, FunderExtDO.class);
        System.out.println("json=" + JSON.toJSONString(funderExtDO));


        String json2 = "{\"name\" : \"chen\"}";
        FunderExtDO funderExtDO2 = JSON.parseObject(json2, FunderExtDO.class);
        System.out.println("json2=" + JSON.toJSONString(funderExtDO2));

        String json3 = "{\"age\" : \"20\"}";
        FunderExtDO funderExtDO3 = JSON.parseObject(json3, FunderExtDO.class);
        System.out.println("jso3n=" + JSON.toJSONString(funderExtDO3));

        String json4 = "{\"address\" : \"chen\"}";
        FunderExtDO funderExtDO4 = JSON.parseObject(json4, FunderExtDO.class);
        System.out.println("json4=" + JSON.toJSONString(funderExtDO4));

        String json5 = "";
        FunderExtDO funderExtDO5 = JSON.parseObject(json5, FunderExtDO.class);
        System.out.println("json5=" + JSON.toJSONString(funderExtDO5));

        List<Instalment> instalmentList = Lists.newArrayList();
        Instalment instalment = new Instalment();
        instalment.setCouponId(1L);
        instalment.setProductCode("33");
        instalment.setProductType("类");
        instalmentList.add(instalment);
        System.out.println("instalmentList=" + JSON.toJSONString(instalmentList));

    }
}
