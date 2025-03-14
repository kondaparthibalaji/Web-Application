package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

					 public String insertdata(Coursemodel cm) {
						 String status="failure"; 
						 try {
							Connection con=JDBCconnection.connect();
							//Statement st=con.createStatement();
							PreparedStatement ps=con.prepareStatement("insert into course1(courseid,coursename,trainer,fee,duration,location) values(?,?,?,?,?,?)");
							ps.setInt(1,cm.getCourseid());
							ps.setString(2,cm.getCoursename());
							ps.setString(3,cm.getTrainer());
							ps.setInt(4, cm.getFee());
							ps.setString(5,cm.getDuration());
							ps.setString(6, cm.getLocation());
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
					 public  List<Coursemodel> courseList() {
						 List<Coursemodel> c1= new ArrayList<>();
							try {
								Connection con=JDBCconnection.connect();
								String str2=("select * from course1");
								PreparedStatement ps1=con.prepareStatement(str2);
								
								ResultSet rs=ps1.executeQuery();
								while(rs.next()) {
									Coursemodel cm=new Coursemodel();
									cm.setCourseid(rs.getInt("cid"));
									cm.setCoursename(rs.getString("cname"));
									cm.setTrainer(rs.getString("trainer"));
									cm.setFee(rs.getInt("fee"));
									cm.setDuration(rs.getString("duration"));
									cm.setLocation(rs.getString("location"));
								}
							}
							catch(Exception e) {
								System.out.println(e);
							}
							return c1;
						 }
					 
					 public void data() {
					 		try {
					 			Connection con=JDBCconnection.connect();
					 			PreparedStatement ps2=con.prepareStatement("select * from course1 where courseid=?");
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
								PreparedStatement ps3=con.prepareStatement("update course1 set mobilenumber=? where courseid=? ");
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
					 			PreparedStatement ps4=con.prepareStatement("delete from course1 where courseid=? ");
					 			ps4.setInt(1,1004);
					 			int n=ps4.executeUpdate();
					 		}
					 		catch(Exception e) {
					 			System.out.println(e);
					 		}
						 
					 }
				}

