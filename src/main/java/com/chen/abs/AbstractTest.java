package com.chen.abs;

public abstract class AbstractTest {
	
	
	protected void  prePost(){
		System.out.println("prePost");
	}
	
	protected void  coustomize(){}
	
	protected void  afterPost(){
		System.out.println("afterPost");
	}
	
	protected abstract void doJob();
	
	protected void  doPost() {
		prePost();
		doJob();
		afterPost();
		coustomize();
	}
	
}
