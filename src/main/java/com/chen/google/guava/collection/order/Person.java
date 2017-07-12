package com.chen.google.guava.collection.order;

/**
 * @author liang.chen
 * @date 2016-11-21
 */
public class Person {

    private boolean flag;

    private String name;

    private String address;

    private int id;

    public String getName() {
        return name;
    }

    public Person(boolean flag, String name, String address, int id) {
        this.flag = flag;
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
