package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome");
		String fname=request.getParameter("firstname");
		System.out.println(fname);
		String lname=request.getParameter("lastname");
		long mn=Long.parseLong(request.getParameter("mobilenumber"));
		String mailid=request.getParameter("mailid");
		String gender=request.getParameter("gender");
		String gd=request.getParameter("graduation");
		String branch=request.getParameter("branch");
		int ypo=Integer.parseInt(request.getParameter("yearofpassedout"));
		String course=request.getParameter("course");
		String dob=request.getParameter("dateofbirth");
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");

		
			Studentmodel sm=new Studentmodel();
			sm.setFirstname(fname);
			sm.setLastname(lname);
			sm.setMobilenumber(mn);
			sm.setMailid(mailid);
			sm.setGender(gender);
			sm.setGraduation(gd);
			sm.setBranch(branch);
			sm.setYearofpassedout(ypo);
			sm.setCourse(course);
			sm.setDateofbirth(dob); 
			sm.setUsername(uname);
			sm.setPassword(pwd);
						
			
			StudentDAO sd = new StudentDAO();
			String status = sd.insertdata(sm);
			System.out.println(status);
			
			if(status.equals("success")) {
			    RequestDispatcher rd1 = request.getRequestDispatcher("/register.html");  
			    rd1.include(request, response);  
			}
			else{
			    RequestDispatcher rd1 = request.getRequestDispatcher("/jslogin.html");  
			    rd1.include(request, response);
			}
		
			
		}
	}


