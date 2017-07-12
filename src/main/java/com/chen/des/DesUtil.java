package com.chen.des;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * DES加密工具类
 *
 * @author liang1.chen
 * @date 2016-10-12
 */
public class DesUtil {
 
    private final static String DES = "DES";

    /**
     * 使用加密秘钥对字符数据进行加密
     *
     * @param data  加密字符串
     * @param key   加密秘钥字符串 (注意：DES加密和解密过程中，密钥长度都必须是8的倍数)
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {
        byte[] dataByteArray = data.getBytes();
        byte[] keyByteArray  = key.getBytes();
        byte[] bt = encrypt(dataByteArray, keyByteArray);           // DES加密
//        String encryptData = new BASE64Encoder().encode(bt);
//        String encryptData = HexUtil.encodeHexStr(bt);              // 对DES加密结果转成16进制字符串
        String encryptData = HexUtil.encodeHexStr(bt);              // 对DES加密结果转成16进制字符串
        return encryptData;
    }

    /**
     * 使用加密秘钥对字符数据进行解密
     *
     * @param data  解密字串传
     * @param key   加密秘钥字符串
     * @return
     * @throws Exception
     */
    public static String decrypt(String data, String key) throws Exception {
        if (data == null) {
            return null;
        }
//        BASE64Decoder decoder = new BASE64Decoder();
//        byte[] dataBuf = decoder.decodeBuffer(data);
        byte[] dataBuf = HexUtil.decodeHex(data.toCharArray());     // 将16进制字符串转成DES加密的字节数组
        byte[] keyBuf  = key.getBytes();
        byte[] result  = decrypt(dataBuf, keyBuf);                  // DES 解密

        return new String(result);
    }

    /**
     * 使用加密秘钥对byte数组进行加密
     *
     * @param data  byte数组加密数据
     * @param key   加密秘钥byte数组
     * @return
     * @throws Exception
     */
    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        Cipher cipher = getCipher(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(data);
    }

    /**
     * Description 根据键值进行解密
     * @param data
     * @param key  加密键byte数组
     * @return
     * @throws Exception
     */
    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        Cipher cipher = getCipher(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(data);
    }

    /**
     * 根据指定模式获取加解密Cipher对象
     *
     * @param cipherMode
     * @param key
     * @return
     */
    private static Cipher getCipher(final int cipherMode, byte[] key) throws Exception {
        SecureRandom secureRandom = new SecureRandom();                           // 生成一个可信任的随机数源
        DESKeySpec dks  = new DESKeySpec(key);                                    // 根据原始加密密钥byte数组数据创建DESKeySpec对象
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(DES);    // 创建密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
        SecretKey secureKey = secretKeyFactory.generateSecret(dks);

        Cipher cipher = Cipher.getInstance(DES);                                  // Cipher对象实际完成解密操作
        cipher.init(cipherMode, secureKey, secureRandom);                         // 用密钥初始化Cipher对象

        return cipher;
    }
}