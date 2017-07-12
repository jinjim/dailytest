package com.chen.enum2;

public class SignTypeTest {
	public static void main(String[] args) {
		System.out.println(SignType.HCB.name() + "||" + SignType.HCB.getVal());
		
		
		System.out.println(StatusEnum.getByCode("10008"+"_"+"GYCCB").getMessage());
		
		System.out.println(StatusEnum.valueOf("PERSION").getCode());
		
	}
}
