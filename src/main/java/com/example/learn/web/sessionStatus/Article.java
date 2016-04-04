package com.example.learn.web.sessionStatus;

import lombok.Data;


public class Article {
	int id;
	int age; 
	String msg;
	String hiddenMsg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getHiddenMsg() {
		return hiddenMsg;
	}
	public void setHiddenMsg(String hiddenMsg) {
		this.hiddenMsg = hiddenMsg;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", age=" + age + ", msg=" + msg + ", hiddenMsg=" + hiddenMsg + "]";
	}
	
	
}
