package com.chen.uniquecode;

import java.util.Random;
import java.util.UUID;

/**
 * @author liang.chen
 * @date 2016-11-05
 */
public class UinqueSeqNoUtil {

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };


    public static String generateSeqNoFor10() {

        Random random1 = new Random();
        Random random2 = new Random();
        int first = random1.nextInt(chars.length);
        int last = random2.nextInt(chars.length);

        String firstChar = chars[first];
        String lastChar  = chars[last];

        StringBuffer shortBuffer = new StringBuffer();
        shortBuffer.append(firstChar);

        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % (0x3E-1)]);
        }

        shortBuffer.append(lastChar);
        return shortBuffer.toString();

    }

//    public staticproxy void main(String[] args) {
//        System.out.println(generateSeqNoFor10());
//    }

}
