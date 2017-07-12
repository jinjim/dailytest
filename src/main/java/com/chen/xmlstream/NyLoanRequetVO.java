package com.chen.xmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-12
 */
@XStreamAlias("Root")
public class NyLoanRequetVO <T> extends NyLoanRequetHeadVO{

    /** 请求体 */
    @XStreamAlias("Body")
    private T body;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
