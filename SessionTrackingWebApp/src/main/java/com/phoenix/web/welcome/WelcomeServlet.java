package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 * @author: raja.kumar@stltech.com
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user=request.getParameter("username");
		HttpSession session=request.getSession();
		
	    session.setMaxInactiveInterval(60);
	    
		System.out.println("Session id: "+session.getId());
		session.setAttribute("username", user);
		
		String encodeUrl=response.encodeURL("products");
		PrintWriter pw=response.getWriter();
		
		pw.println("<body bgcolor=cyan>"+
		         "<h2>Dear "+user+" Welcome to phoenix online shopping</h2>"
		            +"<h3>Session timeout: "+session.getMaxInactiveInterval()+"</h3>"
		       		+ "<h3>to enjoy shopping <a href='"+encodeUrl+"'>click here</a>"+"</h3></body>");
		          
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
