package com.chen.google.guava;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @author liang.chen
 * @date 2016-11-15
 */
public class OptionalTest {
    public static void main(String[] args) {

        Optional<List<String>> optional = Optional.fromNullable(getList());

        if (optional.isPresent()) {
            for (String p : optional.get()) {
                System.out.println("名字：" + p);
            }
        }
        System.out.println(optional.isPresent());
    }

    public static List<String> getList() {
        List<String> listStr = Lists.newArrayList();
//        List<String> listStr = Lists.newArrayList();
//        listStr.add("001");
//        listStr.add("002");

        if(CollectionUtils.isEmpty(listStr)){
            return null;
        }

        return listStr;
    }

}
