package com.chen.des;

public class DesTest {
	
    public static void main(String[] args) throws Exception {
        String data = "000057hellowsddfsdffffff测试类fffffffsdfsdfsdforld";
        String key  = "C5B2A628A7B9E3B2";

        String encryptDataStr = DesUtil.encrypt(data, key);
        String decryptDataStr = DesUtil.decrypt(encryptDataStr, key);

        System.out.println("加密后：" + encryptDataStr);
        System.out.println("解密后：" + decryptDataStr);

        System.out.println("字符串组合:" + String.format("%06d", 123));
    }
}