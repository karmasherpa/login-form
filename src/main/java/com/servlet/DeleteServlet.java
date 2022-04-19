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

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");

		
		try {
			//load the driver/register
			Class.forName("com.mysql.jdbc.Driver");
			
			
			try {
				//creating a connecion
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			
				
				//creating a statement
				PreparedStatement ps=conn.prepareStatement("delete from profile where username=?");
				ps.setString(1,username);	

				
				//execute the query
				int x=ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Record deleted successfully");
					request.setAttribute("message", "Record deleted successfully");
					request.getRequestDispatcher("delete.jsp").forward(request, response);
				}
				else {
					System.out.println("Record not deleted");
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
