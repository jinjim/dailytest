package com.chen.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author liang.chen
 * @date 2016-11-30
 */

@Setter
@Getter
//@Data
//@Log4j
@NoArgsConstructor
//@AllArgsConstructor
public class Person {

    private String name;

    private String identity;

    private Student student;

}
