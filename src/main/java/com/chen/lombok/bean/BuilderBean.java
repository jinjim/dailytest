package com.chen.lombok.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liang.chen
 * @date 2017-01-16
 */


@Setter
@Getter
//@Builder(builderClassName = "HelloWorldBuilder", buildMethodName = "execute", builderMethodName = "helloWorld", toBuilder = true)
//@NoArgsConstructor
@Builder
public class BuilderBean {

    private String name;

    private String address;
}
