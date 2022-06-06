package io.goodname01.controller;

public class Message {
	public String name;
	public String msg;
	
	public Message(String name, String msg){
		this.name = name;
		this.msg = msg;
	}
	
	public String getName() {
		return this.name;
	}
	public String getMsg() {
		return this.msg;
	}
	
}
