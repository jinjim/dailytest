package com.chen.hcbxmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-13
 */
@XStreamAlias("Root")
public class NyLoanReqBean {

    @XStreamAlias("Head")
    private NyLoanReqHead head = new NyLoanReqHead();

    @XStreamAlias("Body")
    private NyLoanBody body = new NyLoanBody();

    public NyLoanReqHead getHead() {
        return head;
    }

    public void setHead(NyLoanReqHead head) {
        this.head = head;
    }

    public NyLoanBody getBody() {
        return body;
    }

    public void setBody(NyLoanBody body) {
        this.body = body;
    }
}
