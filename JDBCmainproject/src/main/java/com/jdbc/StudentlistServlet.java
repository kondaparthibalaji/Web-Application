package com.jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class StudentlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello student controller");
		StudentDAO sd = new StudentDAO();
        List<Studentmodel> list = sd.studentList();
        for(Studentmodel sl:list) {
        	System.out.println(sl.getFirstname());
        	System.out.println(sl.getLastname());
        	System.out.println(sl.getUsername());
        }
        System.out.println("hello list");
        if(list != null) {
	        request.setAttribute("student",list);
	        RequestDispatcher rd1 = request.getRequestDispatcher("/studentlist.jsp");
	        rd1.include(request, response);
		}
		else {
	    	RequestDispatcher rd1 = request.getRequestDispatcher("/errorpage.jsp");
			rd1.include(request, response);
		}
	}
}
