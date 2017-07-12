package com.chen.inter;

import com.alibaba.fastjson.JSON;

public class InterTest {
	public static void main(String[] args) {
		InterTest interTest = new InterTest();
		
		LoanApplyRequestContext larc = new LoanApplyRequestContext();
		larc.setName("chenliang");
		larc.setAddress("chengdu");
		larc.setAge(20);
		
		interTest.printObj(larc);
		
		
		LoanQueryRequestContext lqrc = new LoanQueryRequestContext();
		lqrc.setAmount("200");
		lqrc.setEmail("chenliang@qq.com");
		lqrc.setName("chenliang");
		lqrc.setOrderNo("123");
		
		interTest.printObj(lqrc);
		
	}
	
	private void printObj(RequestContext requestContext){
		System.out.println("requestContext result:" + JSON.toJSONString(requestContext));
	}
}
