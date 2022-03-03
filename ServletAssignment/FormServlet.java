package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet
{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname = req.getParameter("user");
		String password = req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		if(uname.equals("Admin") && password.equals("pass")) {
			out.println("Welcome");
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));

			int k = i+j;
			
			
			out.println("Addition is : "+k);
		}
		else {
			out.println("Sorry !!Either of username or Password was incorrect");
		}
		
		
	}
	
}
