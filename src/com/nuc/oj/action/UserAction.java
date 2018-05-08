package com.nuc.oj.action;

public class UserAction {
	public String code;
	public String add() {
		System.out.println(code);
		return "add";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
