package com.chen.mac;
import javax.crypto.Mac;  
import javax.crypto.SecretKey;  
import javax.crypto.SecretKeyFactory;  
import javax.crypto.spec.PBEKeySpec;  
  
/**  
 * 基于MAC（消息验证码）的数字摘要  
 * @author 我夕  
 *  
 */  
public class DigitMAC {  
  
      
    public static void main(String[] args) throws Exception{  
        MacDigest();  
    }  
    /**  
     * 基于MAC（消息验证码）的数字摘要  
     * 原理根据数据与密码算出来的  
     */  
    private static void MacDigest() throws Exception{  
        PBEKeySpec keySpec = new PBEKeySpec("hello java!".toCharArray());  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");  
        SecretKey key = keyFactory.generateSecret(keySpec);  
          
        Mac mac = Mac.getInstance("HmacMD5");  
        mac.init(key);  
        byte[] source = new byte[]{1,2,3,4,5};        
        byte[] dest = mac.doFinal(source);  
        System.out.println(dest.length);  
        for(int i=0;i<dest.length;i++){  
            System.out.print(dest[i]);  
        }             
    }  
  
  
}  