package com.chen.apache;

/**
 * @author liang.chen
 * @create 2016-10-27
 */
public class Student implements ContractReqVO{
    private String name;
    private String userAddress;

    public ParamJson getParamJson() {
        return paramJson;
    }

    public void setParamJson(ParamJson paramJson) {
        this.paramJson = paramJson;
    }

    private   ParamJson paramJson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
