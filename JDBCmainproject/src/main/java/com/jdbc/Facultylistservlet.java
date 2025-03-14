package com.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class Facultylistservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello faculty controller");
		FacultyDAO fd = new FacultyDAO();
        List<Facultymodel> list = fd.facultyList();
        for(Facultymodel fl:list) {
        	System.out.println(fl.getFirstname());
        	System.out.println(fl.getLastname());
        	System.out.println(fl.getUsername());
        }
        System.out.println("hello list");
        if(list != null) {
	        request.setAttribute("faculty",list);
	        RequestDispatcher rd1 = request.getRequestDispatcher("/facultylist.jsp");
	        rd1.include(request, response);
		}
		else {
	    	RequestDispatcher rd1 = request.getRequestDispatcher("/errorpage.jsp");
			rd1.include(request, response);
		}
	}

}
