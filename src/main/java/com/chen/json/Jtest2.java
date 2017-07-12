package com.chen.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author liang.chen
 * @date 2016-11-01
 */
public class Jtest2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Student student = new Student();
        student.setName("chenlaing");
//        student.setAddress("chengdu");

        Result<Student> result = new Result<>();
        result.setContent(student);

        result.setErrorCode("123");
        result.setErrorMsg("errmsg");
        result.setRequestId("12333");
        result.setStatus("OK");

        String jsonstr = JSON.toJSONString(result);

        System.out.println("jsonstr:" + JSON.toJSONString(student));

//        Result<Student> result2 = new Result<>();
//
//        JSONObject jsonObject = JSON.parseObject(jsonstr);
//        result2.setStatus(jsonObject.getString("status"));
//        result2.setErrorCode(jsonObject.getString("errorCode"));
//        result2.setErrorMsg(jsonObject.getString("errorMsg"));
//        result2.setRequestId(jsonObject.getString("requestId"));
//
//        if ("OK".equals(result2.getStatus())) {
//            result2.setContent(jsonObject.getObject("content", Student.class));
//        }
//
//        Result<Student> result3 = new Result<>();
//        BeanUtils.copyProperties(result3,result2);
//
//        System.out.println("json    :" + jsonstr);
//        System.out.println("toBean  :" + JSON.toJSONString(result2));
//        System.out.println("result3 :" + JSON.toJSONString(result2));

    }
}
