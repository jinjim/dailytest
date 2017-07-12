package com.chen.xmlstream;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("person")
public class Person {
	
	//将name设置为XML person 元素的 attribute  
//    @XStreamAsAttribute
//	@XStreamOmitField  // 忽略字段
    private String name;
    
    @XStreamAlias("PHONE_NUMBER")
	private int phoneNuber;  
	
	private Student student;
    
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	//将此字段名在XML中去掉  
//	@XStreamImplicit
//    @XStreamImplicit(itemFieldName="part")  
    private List<Address> addresses = new ArrayList<Address>();  
    
    
    private Address address;
    
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNuber() {
		return phoneNuber;
	}

	public void setPhoneNuber(int phoneNuber) {
		this.phoneNuber = phoneNuber;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
