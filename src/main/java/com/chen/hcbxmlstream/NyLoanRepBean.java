package com.chen.hcbxmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-13
 */
@XStreamAlias("Root")
public class NyLoanRepBean {

    @XStreamAlias("Head")
    private NyLoanRepHead head = new NyLoanRepHead();

    @XStreamAlias("Body")
    private NyLoanBody body;

    public NyLoanRepHead getHead() {
        return head;
    }

    public void setHead(NyLoanRepHead head) {
        this.head = head;
    }

    public NyLoanBody getBody() {
        return body;
    }

    public void setBody(NyLoanBody body) {
        this.body = body;
    }
}
