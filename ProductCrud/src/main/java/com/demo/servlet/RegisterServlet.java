package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

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
		PrintWriter out=response.getWriter();
		LoginService ls = new LoginServiceImpl();
		String Uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String gender =request.getParameter("gender");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		boolean status = ls.registeruser(Uname,pass,name);
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		out.println("registration successful");
		rd.include(request, response);
		
		
	}

}
