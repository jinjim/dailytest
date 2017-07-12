package com.chen.test;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * DES加密，并生成MAC校验码
 *
 * @author liang1.chen
 * @date 2016-10-12
 */
public class DesMacUtil {

	private final static String DES = "DES";
	private final static String CIPHER_ALGORITHM = "DES/ECB/NoPadding";


	/**
	 * 根据指定模式获取加解密Cipher对象
	 *
	 * @param cipherMode 加解密模式
	 * @param key
	 * @return
	 */
	private static Cipher getCipher(final int cipherMode, byte[] key) throws Exception {
			SecureRandom secureRandom = new SecureRandom();                           // 生成一个可信任的随机数源
			DESKeySpec dks  = new DESKeySpec(key);                                    // 根据原始加密密钥byte数组数据创建DESKeySpec对象
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(DES);    // 创建密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
			SecretKey secureKey = secretKeyFactory.generateSecret(dks);

			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);                     // Cipher对象实际完成解密操作
			cipher.init(cipherMode, secureKey, secureRandom);                         // 用密钥初始化Cipher对象

			return cipher;
	}

	/**
	 * Description 根据键值进行解密
	 * @param data 待加密数据
	 * @param key  加密键byte数组
	 * @return
	 * @throws Exception
	 */
	private static byte[] encrypt(byte[] data, byte[] key) throws Exception{
		Cipher cipher = getCipher(Cipher.ENCRYPT_MODE, key);		// 解密: Cipher.DECRYPT_MODE； 加密: Cipher.ENCRYPT_MODE
		return cipher.doFinal(data);
	}

	/**
	 * mac计算,数据不为8的倍数，需要补0，将数据8个字节进行异或，再将异或的结果与下一个8个字节异或，一直到最后，将异或后的数据进行DES计算
	 * 
	 * @param key
	 * @param data
	 * @return
	 */
	protected static byte[] calculateMacByte(byte[] key, byte[] data) throws Exception{
		byte[] IV = new byte[8];
		for (int i = 0; i < data.length;) {
			IV[i & 7] ^= data[i];
			++i;
			if (((i % 8) == 0) || (i == data.length)) {
				IV = encrypt(IV, key);
			}
		}

		return IV;
	}

	/**
	 * 根据加密key对content进行DES加密并计算得到MAC校验码的字节数组
	 *
	 * @param key
	 * @param data
     * @return
     */
	public static byte[] calculateMac(String key, String data) throws Exception{
		byte[] keyBytes  = key.getBytes();
		byte[] dataBytes = data.getBytes();
		byte[] macVBytes = calculateMacByte(keyBytes, dataBytes);

		return macVBytes;
	}

	/**
	 * 根据加密key对content进行DES加密并计算得到MAC校验码的字节数组并转成16进制字符串
	 *
	 * @param key
	 * @param data
	 * @return
	 */
	public static String calculateHexMac(String key, String data) throws Exception{
		byte[] keyBytes  = key.getBytes();
		byte[] dataBytes = data.getBytes();
		byte[] macVBytes = calculateMacByte(keyBytes, dataBytes);
		String hexMacStr = HexUtil.encodeHexStr(macVBytes);
		return hexMacStr;
	}

	 public static void main(String[] args) {
	 	String key = "C5B2A628A7B9E3B2";
	 	String context = "2016110117413479416091246";
	 	try {
	 		String macStr = DesMacUtil.calculateHexMac(key, context);
	 		System.out.println(macStr);
	 	}catch (Exception e){
	 		e.printStackTrace();
	 	}
	 }
}