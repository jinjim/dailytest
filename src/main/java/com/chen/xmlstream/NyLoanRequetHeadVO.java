package com.chen.xmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-12
 */
@XStreamAlias("Head")
public class NyLoanRequetHeadVO {

    /** 交易代码 */
    @XStreamAlias("TransCode")
    private String transCode;

    /** 交易日期 */
    @XStreamAlias("TransDate")
    private String transDate;

    /** 交易时间 */
    @XStreamAlias("TransTime")
    private String TransTime;

    /** 交易流水号 */
    @XStreamAlias("EntrNo")
    private String entrNo = "03003";

    /** 业务日期 */
    @XStreamAlias("BusiDate")
    private String busiDate;

    /** 交易流水号 */
    @XStreamAlias("SeqNo")
    private String seqNo;

    /** 请求体 */
    @XStreamAlias("VersionId")
    private String versionId = "1.0";

    /** 产品类型 */
    @XStreamAlias("BusiType")
    private String busiType = "01";

    /** ?? */
    @XStreamAlias("OperaName")
    private String operaName;

    /** 暂时不用 */
    @XStreamAlias("Reserve")
    private String reserve;

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return TransTime;
    }

    public void setTransTime(String transTime) {
        TransTime = transTime;
    }

    public String getEntrNo() {
        return entrNo;
    }

    public void setEntrNo(String entrNo) {
        this.entrNo = entrNo;
    }

    public String getBusiDate() {
        return busiDate;
    }

    public void setBusiDate(String busiDate) {
        this.busiDate = busiDate;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getOperaName() {
        return operaName;
    }

    public void setOperaName(String operaName) {
        this.operaName = operaName;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }
}
