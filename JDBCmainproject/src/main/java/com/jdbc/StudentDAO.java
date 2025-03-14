package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

				 public String insertdata(Studentmodel sm) {
					 String status="failure"; 
					 try {
						Connection con=JDBCconnection.connect();
						//Statement st=con.createStatement();
						PreparedStatement ps=con.prepareStatement("insert into student1(firtsname, lastname, mobilenumber, mailid, gender, graduation,"
								+ " branch, yearofpassedout, course, dateofbirth, username, password) values(?,?,?,?,?,?,?,?,?,?,?,?)");
						ps.setString(1,sm.getFirstname());
						ps.setString(2,sm.getLastname());
						ps.setLong(3,sm.getMobilenumber());
						ps.setString(4, sm.getMailid());
						ps.setString(5,sm.getGender());
						ps.setString(6, sm.getGraduation());
						ps.setString(7, sm.getBranch());
						ps.setInt(8, sm.getYearofpassedout());
						ps.setString(9, sm.getCourse());
						ps.setString(10, sm.getDateofbirth());
						ps.setString(11,sm.getUsername());
						ps.setString(12, sm.getPassword());
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
				 public List<Studentmodel> studentList() {
					 List<Studentmodel> s1= new ArrayList<>();
						try {
							Connection con=JDBCconnection.connect();
							String str=("select * from student1");
							PreparedStatement ps1=con.prepareStatement(str);
							ResultSet rs=ps1.executeQuery();
							
							while(rs.next()) {
								Studentmodel sm=new Studentmodel();
								sm.setFirstname(rs.getString("fname"));
								sm.setLastname(rs.getString("lname"));
								sm.setMobilenumber(rs.getLong("mn"));
								sm.setMailid(rs.getString("mailid"));
								sm.setGender(rs.getString("gender"));
								sm.setGraduation(rs.getString("gd"));
								sm.setBranch(rs.getString("branch"));
								sm.setYearofpassedout(rs.getInt("ypo"));
								sm.setCourse(rs.getString("course"));
								sm.setDateofbirth(rs.getString("dob")); 
								sm.setUsername(rs.getString("uname"));
								sm.setPassword(rs.getString("pwd"));
							}
						}
						catch(Exception e) {
							System.out.println(e);
						}
						return s1;
					 }
				 
				 public void data() {
				 		try {
				 			Connection con=JDBCconnection.connect();
				 			PreparedStatement ps2=con.prepareStatement("select * from student where studentid=?");
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
							PreparedStatement ps3=con.prepareStatement("update student set mobilenumber=? where studentid=? ");
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
				 			PreparedStatement ps4=con.prepareStatement("delete from student where studentid=? ");
				 			ps4.setInt(1,1004);
				 			int n=ps4.executeUpdate();
				 		}
				 		catch(Exception e) {
				 			System.out.println(e);
				 		}
					 
				 }
			}




