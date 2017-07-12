package com.chen.abs;

import com.google.common.collect.Lists;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author liang.chen
 * @date 2017-01-05
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\56QQ\\"+System.currentTimeMillis()+".txt");
//        FileWriter fileWriter = new FileWriter(file,true);
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write("DDD".getBytes());

        List<String> list = Lists.newArrayList();
        list.add(null);
        list.add(null);

        System.out.println("list size = "+ list.size());

        for (String s : list) {
            System.out.println("== " + s);
        }

    }



}
