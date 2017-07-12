package com.chen.xmlstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("address")
public class Address {
	
	@XStreamAlias("STR_EET")
	private String street;  
    public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	private int houseNo;  
}
