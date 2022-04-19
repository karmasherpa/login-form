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


@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//reading the data from browser(login.jsp)     
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
				PreparedStatement ps=conn.prepareStatement("UPDATE profile SET password=?, fullname=?, email=?, gender=? where username=?");
				
				ps.setString(1,password);
				ps.setString(2,fullname);
				ps.setString(3,email);
				ps.setString(4,gender);
				ps.setString(5,username);


				//execute the query
				int x=ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Record updated successfully");
					
					UserDTO userDTO = new UserDTO(username,password,fullname,email,gender);
					request.setAttribute("userDTO", userDTO);

					request.setAttribute("message", "Record updated successfully");
					request.getRequestDispatcher("update.jsp").forward(request, response);
					
				}
				else {
					System.out.println("Record not updated");
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
