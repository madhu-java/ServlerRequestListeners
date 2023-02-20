package com.madhu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static {
    	System.out.println("testservlet is loading...");
    }
    public TestServlet() {
    	System.out.println("testservlet is instantoated...");
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		out.println("This is requesr listener Testsevlet");
		request.setAttribute("Greet", "GoodMorning");
		request.setAttribute("name","madhu");
		request.removeAttribute("name");
		request.setAttribute("name", "nithin");
		request.setAttribute("bye", "goodbye");
		out.close();
		
	}
	@Override
	public void destroy() {
		System.out.println("testservlet is destroyed...");
	}

	

}
