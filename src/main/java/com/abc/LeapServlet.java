package com.abc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LeapServlet")
public class LeapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//here storing a input value in string form
		//paramerer "number" receives from html page
		 String str=request.getParameter("num");
		 
		 //parsing a value from string to integer
		 int year=Integer.parseInt(str);
		 
		 boolean leap = false;    
		 
		// if the year is divided by 4
		    if (year % 4 == 0) {

		      // if the year is century
		      if (year % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // if the year is not century
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap) {
		      System.out.println(year + " is a leap year.");
		      String temp=year + " is a leap year.";
		      request.setAttribute("result", temp);
		    }
		    else
		    {
		      System.out.println(year + " is not a leap year.");
		      String temp=year + " is not a leap year.";
		      request.setAttribute("result", temp);
		    }
		
		    
		    //RequestDispatcher receives requests from the client and sends them to a resource 
		    //such as a servlet, HTML file, JSP file,
		    
		 //RequestDispatcher can obtained from the request object with the getRequestDispatcher method.
		    RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		    rd.forward(request, response);
		    //RequestDispatcher forwards a request from a servlet to another resource
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
