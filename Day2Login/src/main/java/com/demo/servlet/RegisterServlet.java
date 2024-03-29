package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		LoginService ls = new LoginServiceImpl();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String nm=request.getParameter("name");
		String gender=request.getParameter("gender");		
		String[] hobbies=request.getParameterValues("hobbies");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		System.out.println("name"+nm);
		System.out.println("gender"+gender);
		System.out.println("City"+city);
		System.out.println("hobbies"+Arrays.toString(hobbies));
		boolean status=ls.registeruser(uname,pass,nm);
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		out.println("Registered successfully, pls enter credentials");
		rd.include(request, response);
	}

}
