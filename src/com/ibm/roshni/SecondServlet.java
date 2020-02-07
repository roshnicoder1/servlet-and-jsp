package com.ibm.roshni;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	//out
	PrintWriter p=response.getWriter();
	p.println("Hello from second server");
	//request
	String firstname=request.getParameter("firstName");
	String lastname=request.getParameter("lastName");
	//session and context
	HttpSession session=request.getSession();
	ServletContext context=request.getServletContext();
//	String str=context.getInitParameter("name");
	ServletConfig sc=getServletConfig();
	String str=sc.getInitParameter("name");
	
	
	p.println(str);
	if(firstname!=null && firstname!="") {
		session.setAttribute("sessionUserName", firstname);
		context.setAttribute("contextUserName", firstname);
		
		
	}
	
	p.println("Request object"+firstname);
	p.println("<br>session object"+(String)session.getAttribute("sessionUserName"));
	p.println("<br>context object"+(String)context.getAttribute("contextUserName"));
	p.println(lastname);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	//out
	PrintWriter p=response.getWriter();
	p.println("Hello from second server");
	String firstname=request.getParameter("firstName");
	String lastname=request.getParameter("lastName");
	
	p.println(firstname);
	p.println(lastname);
	
	}

}
