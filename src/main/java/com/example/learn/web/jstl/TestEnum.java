package com.example.learn.web.jstl;

public enum TestEnum {

	Test1("hi", "1"),Test2("hi2", "2");
	
	String engHi;
	String korHi;
	
	TestEnum(String engHi, String korHi) {
		this.engHi = engHi;
		this.korHi = korHi;
	}
	
	public String getValue(){
		return engHi;
	}
	
}
