package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class CourselistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello Course controller");
		CourseDAO cd = new CourseDAO();
        List<Coursemodel> list = cd.courseList();
        for(Coursemodel cl:list) {
        	System.out.println(cl.getCourseid());
        	System.out.println(cl.getCoursename());
        	System.out.println(cl.getTrainer());
        }
        System.out.println("hello list");
        if(list != null) {
	        request.setAttribute("course",list);
	        RequestDispatcher rd1 = request.getRequestDispatcher("/courselist.jsp");
	        rd1.include(request, response);
		}
		else {
	    	RequestDispatcher rd1 = request.getRequestDispatcher("/errorpage.jsp");
			rd1.include(request, response);
		}
	}

}
