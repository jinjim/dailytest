package com.chen.json.fastjson;

/**
 * @author liang.chen
 * @date 2017-03-23
 */
public class Instalment {

    private String productCode;

    private String productType;

    private Long couponId;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
}
