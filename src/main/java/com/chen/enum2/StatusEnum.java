package com.chen.enum2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.Map;

public enum StatusEnum{
    DIRECT("10008_GYCCB", "定向支付"),
    PERSION("10008_GY", "个人卡");
	
    /** 编码. */
    private        String                code;
    
    /** 描述. */
    private        String                message;
    
    /** 枚举值保存 hash map. */
    private static Map<String, StatusEnum> codeLookup;

    static {
        codeLookup = new HashMap<>();
        for (StatusEnum enumUnit : values()) {
            codeLookup.put(enumUnit.getCode(), enumUnit);
        }
    }

    StatusEnum(String code, String name) {
        this.code = code;
        this.message = name;
    }

    /**
     * 根据 code 拿到枚举对象.
     *
     * @param code code 值.
     * @return 枚举对象.
     */
    public static StatusEnum getByCode(String code) {
        return (StatusEnum) codeLookup.get(code);
    }

    public String getCode() {
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
