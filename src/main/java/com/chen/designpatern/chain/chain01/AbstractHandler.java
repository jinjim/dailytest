package com.chen.designpatern.chain.chain01;

/**
 * @author liang.chen
 * @date 2016-10-30
 */
public abstract class AbstractHandler implements Handler {

    private Handler handler;

    /**
     * 设置下一个处理器
     *
     * @param handler
     */
    @Override
    public void setNextHandler(Handler handler){
        this.handler = handler;
    }

    /**
     * 获得下一个处理器
     *
     * @return
     */
    @Override
    public Handler getNextHandler(){
        return handler;
    }


    @Override
    public boolean handle() {
        handleRequest();

        if(getNextHandler() != null){
            getNextHandler().handle();
        }

        return false;
    }

    /**
     * 执行实现的处理方法
     *
     * @return
     */
    public abstract boolean handleRequest();
}
