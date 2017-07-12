package com.chen.enum2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.Map;


/**
 * 充值记录状态
 */
public enum RechcargeStatusEnum {
    // 状态:0-新订单 / 1-已支付 / 2-开始写卡 / 3-已充值 / 4-已取消 / 5-充值失败/6-申请退款/7-退款成功

    NEW(0, "新订单"),
    PAIED(1, "已支付"),
    BEGIN_WRITE_CARD(2, "开始写卡"),
    RECHARGED(3, "已充值"),
    CANCED(4, "已取消"),
    RECHARGED_FAIL(5, "充值失败"),
    APPLY_RETURN(6, "申请退款"),
    RETURN_SUCCESS(7, "退款成功"),
    ;

    /**
     * 编码.
     */
    private Integer code;

    /**
     * 描述.
     */
    private String message;

    /**
     * 枚举值保存 hash map.
     */
    private static Map<Integer, RechcargeStatusEnum> codeLookup;

    static {
        codeLookup = new HashMap<>();
        for (RechcargeStatusEnum enumUnit : values()) {
            codeLookup.put(enumUnit.getCode(), enumUnit);
        }
    }

    RechcargeStatusEnum(Integer code, String name) {
        this.code = code;
        this.message = name;
    }

    /**
     * 根据 code 拿到枚举对象.
     *
     * @param code code 值.
     * @return 枚举对象.
     */
    public static RechcargeStatusEnum getByCode(Integer code) {
        return codeLookup.get(code);
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
