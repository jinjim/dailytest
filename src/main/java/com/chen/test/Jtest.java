package com.chen.test;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author liang.chen
 * @create 2016-10-26
 */
public class Jtest {


    private static Map<String, String> hm = new HashMap<>();

    private static Logger logger = LoggerFactory.getLogger(Jtest.class);

    static {

        hm.put("dd", "DD");

        System.out.println("hm size : " + hm.size());
    }

    public static void main(String[] args) throws IOException {

//        System.out.println("dd");
//
////        String code = "2016110117413479416091246";
////
////        String macStr = MacUtil.MAC("C5B2A628A7B9E3B2", "0000000000000000", code, MacUtil.ASC);  // 计算16位16进制MAC校验码
////
////        System.out.println(macStr);
////
////
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
////
////        String str = simpleDateFormat.format(new Date());
////
////        System.out.println(JSON.toJSONString(null));
//
//        String str = "南粤信贷系统调用提示:错误响应码; 交易流水:ZavtUlAPMF; 响应信息:[code=00100] 这笔提款已经交易成功！(资产管理资金方服务)";
//
//

//        boolean start = StringUtils.contains(str, "交易成功");
//        System.out.println("flag:" + start);

//        int value;
//        boolean flag = true;
//        int result = value = flag ? 1 : 0;
//        System.out.println("flag:" + flag);
//        System.out.println("result:" + result);
//
//        int i01 = 10;
//        int i02 = 10;
//
//        int i03 = 130;
//        Integer i04 = 130;
//
//        Integer i05 = 130;
//        Integer i06 = 130;
//
//        System.out.println("i01 = 102 : " + (i01 == i02));
//        System.out.println("i03 = 104 : " + (i03 == i04));
//        System.out.println("i05 = 106 : " + (Objects.equals(i05,i06)));
//
//
//        Jtest j01 = new Jtest();
//        Jtest j02 = new Jtest();
//        Jtest J03 = j01;
//
//        System.out.println(j01.equals(j02));
//        System.out.println(Objects.equals(j01, j02));
//        System.out.println(j01.equals(J03));
//
//        List<String>  list = Lists.newArrayList();
//        String string = "10.0.00";
//        BigDecimal bigDecimal =new BigDecimal(string).setScale(4, BigDecimal.ROUND_HALF_UP);
//        String OutString = bigDecimal.toString();
//        System.out.println("string:" + OutString);
//
//        String string1 = "100";
//        BigDecimal bigDecimal1 =new BigDecimal(string).setScale(4, BigDecimal.ROUND_HALF_UP);
//        String OutString1 = bigDecimal.toString();
//
//        System.out.println("string2:" + OutString1);
//
//        System.out.println(StringUtils.equals(OutString, OutString1));
//        List<String> tlist = ImmutableList.of("1", "2", "3", "4", "5");
//
//        List<List<String>> listList = Lists.newArrayList();
//        List<String> list = Lists.newArrayList();
//        for (int i = 0, len = tlist.size(); i < len; i++) {
//            list.add(tlist.get(i));
//
//            if (i > 0 && (i+1) % 2 == 0) {  // 每200个组合成一个列表批量保存
//                listList.add(list);
//                list = Lists.newArrayList();
//            } else if ((i+1) == len) {
//                listList.add(list);
//            }
//        }
//
//        System.out.println("result="+ JSON.toJSONString(list));

//        Map<String, String> sourceMap = Splitter.on("|").omitEmptyStrings().trimResults()
//                .withKeyValueSeparator("=").split("");
//        System.out.println("");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMd-dHHmmss");
//        try {
//            Date date = simpleDateFormat.parse("20170608000000s");
//            Date date2 = simpleDateFormat.parse("20170608000001s");
//
//            Date minDate = date.compareTo(date2) < 0  ? date : date2;
//            Date maxDate = date.compareTo(date2) >= 0 ? date : date2;
//            System.out.println("");
//        } catch (Exception e) {
//            logger.error("Deal date convert error when calculate begin deal date and end deal date, convert str={}", "dd", e);
//        }
//
//        URL url = new URL("http://img.bimg.126.net/photo/DCi7Q__VN3NJ_63cq7sosA==/3439905690381537164.jpg");
//        FileUtils.copyURLToFile(url, new File("H:\\"));

    }
}
