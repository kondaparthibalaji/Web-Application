package com.jdbc;

public class Coursemodel {
	private int courseid;
	private String coursename;
	private String trainer;
	private int fee;
	private String duration;
	private String location;
	
	public Coursemodel() {}
	public Coursemodel(int courseid, String coursename, String trainer, int fee, String duration, String location) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.trainer = trainer;
		this.fee = fee;
		this.duration = duration;
		this.location = location;
	}
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
