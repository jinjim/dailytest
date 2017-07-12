package com.chen.hcbxmlstream;

import com.chen.xmlstream.Student;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author liang.chen
 * @create 2016-10-13
 */
@XStreamAlias("Body")
public class NyLoanRepApplyBody extends NyLoanBody {

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("address")
    private String address;

    @XStreamAlias("student")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
