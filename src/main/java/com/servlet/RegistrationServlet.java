package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		try {
			//load the driver/register
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				//creating a connecion
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			
				
				//creating a statement
				PreparedStatement ps=conn.prepareStatement("INSERT INTO profile VALUES(?,?,?,?,?)");
				ps.setString(1,username);	
				ps.setString(2,password);
				ps.setString(3,fullname);
				ps.setString(4,email);
				ps.setString(5,gender);

				
				//execute the query
				int x=ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Record inserted successfully");
					request.setAttribute("message", "Record inserted successfully");
					request.getRequestDispatcher("record.jsp").forward(request, response);
				}
				
			
				
				
				} catch (SQLException e) {
				e.printStackTrace();
				}

			
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
