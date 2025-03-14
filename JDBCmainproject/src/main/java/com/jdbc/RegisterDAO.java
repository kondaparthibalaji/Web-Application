package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDAO {

	public String insertData(RegisterModel rm) {
		String status="failure";
		System.out.println("dao data: "+rm.getusername());
		System.out.println("dao data: "+rm.getpassword());
		try {
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection establish
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube", "root", "root");
			 System.out.println("prepared");
			 PreparedStatement ps = con.prepareStatement("select * from admin where adminname=? and password=?");
			 ps.setString(1, rm.getusername());
			 ps.setString(2, rm.getpassword());
			 ResultSet rs=ps.executeQuery(); 
			 System.out.println("result");
			while(rs.next()) {
				 status="SUCCESS";
				
			 }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}


