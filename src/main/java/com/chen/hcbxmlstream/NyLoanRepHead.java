package com.chen.hcbxmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-13
 */
@XStreamAlias("Head")
public class NyLoanRepHead {

    /** 响应码 */
    @XStreamAlias("RespCode")
    private String respCode;

    /** 响应信息 */
    @XStreamAlias("RespMsg")
    private String respMsg;

    /** 原业务日期 */
    @XStreamAlias("OrgBusiDate")
    private String orgBusiDate;

    /** 交易流水号 */
    @XStreamAlias("OrgSeqNo")
    private String orgSeqNo;

    public String getOrgSeqNo() {
        return orgSeqNo;
    }

    public void setOrgSeqNo(String orgSeqNo) {
        this.orgSeqNo = orgSeqNo;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getOrgBusiDate() {
        return orgBusiDate;
    }

    public void setOrgBusiDate(String orgBusiDate) {
        this.orgBusiDate = orgBusiDate;
    }
}
