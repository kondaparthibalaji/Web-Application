package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cor")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("course servlet");
		int cid=Integer.parseInt(request.getParameter("courseid"));
		System.out.println(cid);
		String cname=request.getParameter("coursename");
		String trainer=request.getParameter("trainer");
		int fee=Integer.parseInt(request.getParameter("fee"));
		String duration=request.getParameter("duration");
		String location=request.getParameter("location");
		
		Coursemodel cm=new Coursemodel();
		cm.setCourseid(cid);
		cm.setCoursename(cname);
		cm.setTrainer(trainer);
		cm.setFee(fee);
		cm.setDuration(duration);
		cm.setLocation(location);
		
		CourseDAO cd = new CourseDAO();
		String status = cd.insertdata(cm);
		System.out.println(status);
		
		if(status.equals("success")) {
		    RequestDispatcher rd1 = request.getRequestDispatcher("/courseregister.html");  
		    rd1.include(request, response);  
		}
		else{
		    RequestDispatcher rd1 = request.getRequestDispatcher("/jslogin4.html");  
		    rd1.include(request, response);
	}

}
}
