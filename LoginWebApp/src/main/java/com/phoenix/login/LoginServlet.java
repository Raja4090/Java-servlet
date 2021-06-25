package com.phoenix.login;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//@author: raja.kumar@stltech.in

public class LoginServlet extends HttpServlet{
      
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		String user=req.getParameter("username");
		String passwd=req.getParameter("passwd");
		
		PrintWriter pw=res.getWriter();
		if(user!=null && passwd!=null && user.equals("Raja") &&passwd.equals("1234"))
			pw.println("<h3 style=color:green;>Let's get started..!</h3>");
		else
			pw.println("<h3 style=color:red;>invalid login!</h3>");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		doPost(req, res);
	}
}
