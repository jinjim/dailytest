package com.chen.designpatern.chain.chain01;

/**
 * @author liang.chen
 * @date 2016-10-30
 */
public interface Handler {

    /**
     * 执行请求处理
     *
     * @return
     */
    boolean handle();

    /**
     * 设置下一个处理器
     *
     * @param handler
     */
    void setNextHandler(Handler handler);

    /**
     * 获得下一个处理器
     *
     * @return
     */
    Handler getNextHandler();
}
