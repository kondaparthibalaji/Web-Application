package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {
	public static Connection connect() {
		Connection con=null;
		try {
			//loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vcube","root","root");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return con; 
	}

}
