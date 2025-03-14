
package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login2")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("welcome");
	String uname=request.getParameter("username");
	System.out.println(uname);
	String pwd=request.getParameter("password");
	System.out.println(pwd);
	String role=request.getParameter("role");
	System.out.println(role);

		
		if(role.equals("admin")) {
		RegisterModel rm=new RegisterModel();
		rm.setusername(uname);
		rm.setpassword(pwd);
		
		RegisterDAO rd = new RegisterDAO();
		String status = rd.insertData(rm);
		
		if(status.equals("SUCCESS")) {
			System.out.println("hi ");
		    RequestDispatcher rd1 = request.getRequestDispatcher("/admin.html");  
		    rd1.include(request, response);  
		}
		else{
		    RequestDispatcher rd1 = request.getRequestDispatcher("/jslogin2.html");  
		    rd1.include(request, response);
		}
		
		}
	}
}
