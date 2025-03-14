package com.jdbc;

public class RegisterModel {

	private String username;
	private String password;
	
	
	public RegisterModel() {}
	public RegisterModel(String uname,String pwd) {
		this.username=uname;
		this.password=pwd;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
		System.out.println("model data:"+this.username);
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
		System.out.println("model data:"+this.password);
	}
	
	

}

