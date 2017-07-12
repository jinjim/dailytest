package com.chen.apache;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liang.chen
 * @create 2016-10-28
 */
public class BeanMapUtils {

    private static final String CLASS = "class";

    /**
     * 将bean对象转成map
     *
     * @param bean
     * @return
     */
    public static Map<String, String> simpleBeanToMap(Object bean){
        Map<String, String > beanMap = new HashMap<>();
        Map descriptionHolder = null;
        try {
            descriptionHolder = BeanUtils.describe(bean);
            if (MapUtils.isEmpty(descriptionHolder)){
                return Collections.emptyMap();
            }

//            if (MapUtils.isEmpty(descriptionHolder)) {
//                return beanMap;
//            }
//            for (Object entry : descriptionHolder.entrySet()) {
//                Map.Entry mapEntry = (Map.Entry) entry;
//                if("paramJson".equals(mapEntry.getKey())){
//                    beanMap.put((String)mapEntry.getKey(), JSONObject.toJSONString(mapEntry.getValue()));
//                    System.out.println(JSONObject.toJSONString(mapEntry.getValue()));
//                    continue;
//                }
//                if(!CLASS.equals(mapEntry.getKey())){
//                    beanMap.put((String)mapEntry.getKey(), (String)mapEntry.getValue());
//                }
//            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return descriptionHolder;
//        return beanMap;
    }
}
