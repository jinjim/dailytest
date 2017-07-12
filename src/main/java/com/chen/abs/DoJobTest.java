package com.chen.abs;

public class DoJobTest extends AbstractTest{
	@Override
	protected void doJob(){
		System.out.println("DO job");
	}
	
	@Override
	protected void coustomize(){
		System.out.println("coustomize");
	}
	
	@Override
	protected void prePost(){
		System.out.println("prePost ESAFDSF");
	}
	
	public static void main(String[] args) {
		AbstractTest doJobTest = new DoJobTest();
		doJobTest.doPost();
	}
	
}
