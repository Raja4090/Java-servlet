package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 * @author: raja.kumar@gmail.com
 */
@WebServlet("/LoginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("username");
		String passwd=request.getParameter("passwd");
		PrintWriter pw=response.getWriter();
		
		
		if(user!=null && passwd!=null &&passwd.equals("1234") && user.equals("Raja"))
		{
            RequestDispatcher rd = request.getRequestDispatcher("welcome");
            rd.forward(request, response); 
        }  
        else
        {
            pw.print("<h3 style=color:red;>Invalid credentials!</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
         
            rd.include(request, response);  
                        
        }  
	}

}
