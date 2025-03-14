package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/faculty")
public class FacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("faculty Servlet");
		String fname=request.getParameter("firstname");
		System.out.println(fname);
		String lname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		long mn=Long.parseLong(request.getParameter("mobile"));
		String qf=request.getParameter("qualification");
		int yoex=Integer.parseInt(request.getParameter("yearsofexperience"));
		String mailid=request.getParameter("mailid");
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		String cpwd=request.getParameter("confirmpassword");
		
		Facultymodel fm=new Facultymodel();
		fm.setFirstname(fname);
		fm.setLastname(lname);
		fm.setGender(gender);
		fm.setMobile(mn);
		fm.setQualification(qf);
		fm.setYearsofexperience(yoex);
		fm.setMailid(mailid);
		fm.setUsername(uname); 
		fm.setPassword(pwd);
		fm.setConfirmpassword(cpwd);
		
		FacultyDAO fd = new FacultyDAO();
		String status = fd.insertdata(fm);
		System.out.println(status);
		
		if(status.equals("success")) {
		    RequestDispatcher rd1 = request.getRequestDispatcher("/facultyregister.html");  
		    rd1.include(request, response);  
		}
		else{
		    RequestDispatcher rd1 = request.getRequestDispatcher("/jslogin3.html");  
		    rd1.include(request, response);
		}
	

	}

}
