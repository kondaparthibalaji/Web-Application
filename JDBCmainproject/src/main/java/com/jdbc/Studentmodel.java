package com.jdbc;

public class Studentmodel {
	
	private String firstname;
	private String lastname;
	private long mobilenumber;
	private String mailid;
	private String gender;
	private String graduation;
	private String branch;
	private int yearofpassedout;
	private String course;
	private String dateofbirth;
	private String username;
	private String password;
	
	public Studentmodel() {}
	public Studentmodel(String fname,String lname,long mn,String mailid,String gender,String gd,String branch,int ypo,String course,
			String dob,String uname,String pwd) {
		this.firstname=fname;
		this.lastname=lname;
		this.mobilenumber=mn;
		this.mailid=mailid;
		this.gender=gender;
		this.graduation=gd;
		this.branch=branch;
		this.yearofpassedout=ypo;
		this.course=course;
		this.dateofbirth=dob;
		this.username=uname;
		this.password=pwd;		
		
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYearofpassedout() {
		return yearofpassedout;
	}
	public void setYearofpassedout(int yearofpassedout) {
		this.yearofpassedout = yearofpassedout;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
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
	

}
