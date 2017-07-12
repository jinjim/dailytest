package com.chen.apache;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.MapUtils;

import java.util.Map;

/**
 * @author liang.chen
 * @create 2016-10-27
 */
public class BeanUtilsTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("chen");
        student.setUserAddress("chengdu");

        ParamJson t = new ParamJson();
        t.setAddress("ccc");
        t.setName("DDD");

        student.setParamJson(t);

        System.out.println("ObjToJson     :" + getJsonStr(student));
        System.out.println("beanMapToJson :" + JSON.toJSONString(student));

//        if (MapUtils.isNotEmpty(descriptionHolder)) {
//            for (Object entry : descriptionHolder.entrySet()) {
//                Map.Entry mapEntry = (Map.Entry) entry;
//                    System.out.println(""+mapEntry.getKey()+":"+mapEntry.getValue());
//            }
//        }



    }

    public  static String getJsonStr(ContractReqVO contractReqVO){
        Map<String, String> descriptionHolder = BeanMapUtils.simpleBeanToMap(contractReqVO);
        return JSON.toJSONString(descriptionHolder);
    }

}
