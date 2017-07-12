package com.chen.networkdownload;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author liang.chen
 * @date 2017-01-04
 */
public class NetworkDownload {

    /**
     * 从网络Url中下载文件
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static void  downLoadFromUrl(String urlStr,String fileName,String savePath) throws IOException{
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdir();
        }
        File file = new File(saveDir+ File.separator+fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if(fos!=null){
            fos.close();
        }
        if(inputStream!=null){
            inputStream.close();
        }


        System.out.println("info:"+url+" download success");

    }

    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

    public static void main(String[] args) {
        try{
            downLoadFromUrl("https://www.bestsign.cn/openpage/contractDownload.page?mid=ac3219a6e9664206a39894bd31b7762f&fsdid=14697948047324TQ82&status=3&sign=wBBiuOvOGiH%2BA2zIc5PGCvRQpuyRCe2Q2ImWG6QIzjgeBwIP0P1hLeLE5jj%2Fi1G77RQXw0xyQ%2Fp9JIIjTxf57OsM1Cu%2B6%2FenAqepxk6PvWAGKOl4y2THa%2FlJqD%2BIklHjDJQaLjdE%2Bm58qr%2F4Lxchmc4GoqlS3hVRgyxfphbAGwk%3D",
                    "百度.rar","D:\\tmp");
        }catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println("oik");
    }
}
