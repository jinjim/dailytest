package com.chen.xmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-12
 */
@XStreamAlias("Body")
public class NyLoanRequetBodyVO extends NyLoanRequetVO{

    /** 请求头 */
    @XStreamAlias("name")
    private String name;

    /** 请求体 */
    @XStreamAlias("student")
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
