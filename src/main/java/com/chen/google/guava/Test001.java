package com.chen.google.guava;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author liang.chen
 * @date 2016-11-15
 */
public class Test001 {

    public static void main(String[] args) {
//        String name = "dd";
//        System.out.println(checkNotNull(name, "%s can not be null", "name"));
//        List<String> liststr = new ArrayList<>();
//        liststr.add("001");
//        liststr.add("002");
//        liststr.add("003");
//        liststr.add("004");
//
//        String userInput = "nihao1234-1";
//
//        CharMatcher ID_MATCHER = CharMatcher.DIGIT.or(CharMatcher.is('-'));
//
//        System.out.println(ID_MATCHER.retainFrom(userInput));

        /***********************************************************
         * Stopwatch
         * ***********************************************************/

//        Stopwatch stopwatch = Stopwatch.createStarted();
//        long nanos = stopwatch.elapsed(TimeUnit.MILLISECONDS);
//        System.out.println(nanos);
//
//        for (int i = 0; i < 1000000; i++) {
//
//        }
//        long nano2 = stopwatch.elapsed(TimeUnit.MILLISECONDS);
//        System.out.println(nano2);

        /***********************************************************
         * Joiner
         * ***********************************************************/

//        Joiner JOINER= Joiner.on(",").skipNulls();
//
//        Joiner joiner= Joiner.on(",").useForNull("null");
//
//        String[] strs = new String[]{"hello","world",null,"qiyadeng"};
//
//        String str = joiner.join(strs);
//
//        System.out.println(str);

        /***********************************************************
         * Splitter
         * ***********************************************************/

//        String testStr = ",,hello,,qiyadeng,com,,";
//        Iterable<String> splitStr = Splitter.on(",").trimResults().omitEmptyStrings().split(testStr);
//        List<String> list = Lists.newArrayList(splitStr);
////        for (String string : splitStr) {
//            System.out.println(string);
//        }

//        for (String string : list) {
//            System.out.println(string);
//        }

////        String[] splitStr = testStr.split(",");
////        String[] splitStr = StringUtils.split(testStr, ",");
//
////        System.out.println(splitStr.length);
//        for (String string : splitStr) {
//            System.out.println(string);
//        }


    }

//    public static <T> T checkNotNull(T reference, Object errorMessage) {
//        if (reference == null) {
//            throw new NullPointerException(String.valueOf(errorMessage));
//        }
//        return reference;
//    }

}
