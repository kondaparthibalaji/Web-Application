package com.jdbc;

public class Facultymodel {
	private String firstname;
	private String lastname;
	private String gender;
	private long mobile;
	private String qualification;
	private int yearsofexperience;
	private String mailid;
	private String username;
	private String password;
	private String confirmpassword;

	public Facultymodel() {}
	public Facultymodel(String firstname, String lastname, String gender, long mobile, String qualification,
			int yearsofexperience, String mailid, String username, String password, String confirmpassword) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.mobile = mobile;
		this.qualification = qualification;
		this.yearsofexperience = yearsofexperience;
		this.mailid = mailid;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearsofexperience() {
		return yearsofexperience;
	}
	public void setYearsofexperience(int yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
		

}
