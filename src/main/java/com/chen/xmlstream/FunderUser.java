package com.chen.xmlstream;

/**
 * Created by dorid on 2016/7/11.
 */

//@XStreamAlias("person")
public class FunderUser {
//    @XStreamAlias("id")
    private String uid;
    private String funderId;
    private String funderUserId;

    private Test2 test2;

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFunderId() {
        return funderId;
    }

    public void setFunderId(String funderId) {
        this.funderId = funderId;
    }

    public String getFunderUserId() {
        return funderUserId;
    }

    public void setFunderUserId(String funderUserId) {
        this.funderUserId = funderUserId;
    }
}

