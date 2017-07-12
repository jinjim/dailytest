package com.chen.lang3;

import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class TestMain {
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.test01();
	}
	
	private void test01(){
//		List<String> list = new ArrayList<String>();
//		list.add("001");
//		list.add("002");
//		list.add("003");
		List<String> list = Collections.emptyList();
		
		try {
			
			if(CollectionUtils.isEmpty(list)){
				System.out.println("no");
				return;
			}
			
			for (String str : list) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("error");
		}finally {
			System.out.println("ok");
		}
	}
}
