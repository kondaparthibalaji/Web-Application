package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FacultyDAO {

					 public String insertdata(Facultymodel fm) {
						 String status="failure"; 
						 try {
							Connection con=JDBCconnection.connect();
							//Statement st=con.createStatement();
							PreparedStatement ps=con.prepareStatement("insert into faculty1(firstname, lastname,gender,mobile,qualification,yearsofexperience,mailid,username,password,confirmpassword) values(?,?,?,?,?,?,?,?,?,?)");
							ps.setString(1,fm.getFirstname());
							ps.setString(2,fm.getLastname());
							ps.setString(3,fm.getGender());
							ps.setLong(4,fm.getMobile());
							ps.setString(5,fm.getQualification());
							ps.setInt(6, fm.getYearsofexperience());
							ps.setString(7, fm.getMailid());
							ps.setString(8,fm.getUsername());
							ps.setString(9, fm.getPassword());
							ps.setString(10, fm.getConfirmpassword());
							int n=ps.executeUpdate();
							if(n>0) {
								status="success";
							}
						} 
						catch (Exception e) {
							System.out.println(e); 
						}
						return status;
				 }
					 public List<Facultymodel> facultyList() {
						 List<Facultymodel> f1= new ArrayList<>();
							try {
								Connection con=JDBCconnection.connect();
								String str1=("select * from faculty1");
								PreparedStatement ps1=con.prepareStatement(str1);
								ResultSet rs=ps1.executeQuery();
								
								while(rs.next()) {
									Facultymodel sm=new Facultymodel();
									sm.setFirstname(rs.getString("fname"));
									sm.setLastname(rs.getString("lname"));
									sm.setGender(rs.getString("gender"));
									sm.setMobile(rs.getLong("mn"));
									sm.setQualification(rs.getString("qf"));
									sm.setYearsofexperience(rs.getInt("yoex"));
									sm.setMailid(rs.getString("mailid"));
									sm.setUsername(rs.getString("uname"));
									sm.setPassword(rs.getString("pwd"));
									sm.setConfirmpassword(rs.getString("cpwd"));
								}
							}
							catch(Exception e) {
								System.out.println(e);
							}
							return f1;
						 }
					 
					 public void data() {
					 		try {
					 			Connection con=JDBCconnection.connect();
					 			PreparedStatement ps2=con.prepareStatement("select * from faculty where facultyid=?");
					 			ps2.setInt(1,1001);
					 			ResultSet rs=ps2.executeQuery();
					 			rs.next();
					 				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" +rs.getLong(3)+":"+rs.getString(4)+":"+rs.getInt(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8));
					 			
					 		}
					 		catch(Exception e) {
					 			System.out.println(e);
					 		}
					 	 }
					 
					 public void updatedata() {
							try {
								Connection con=JDBCconnection.connect();
								PreparedStatement ps3=con.prepareStatement("update faculty set mobilenumber=? where facultyid=? ");
								ps3.setLong(1,9701574933L);
								ps3.setInt(2,1004);
								int n=ps3.executeUpdate();
								
							}
							catch(Exception e) {
								System.out.println(e);
							}
						 }
					 
					 public void deletedata() {
						 try {
					 			Connection con=JDBCconnection.connect();
					 			PreparedStatement ps4=con.prepareStatement("delete from faculty where facultyid=? ");
					 			ps4.setInt(1,1004);
					 			int n=ps4.executeUpdate();
					 		}
					 		catch(Exception e) {
					 			System.out.println(e);
					 		}
						 
					 }
				}


