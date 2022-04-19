package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/editServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				//reading the data from browser(login.jsp)
				String user=request.getParameter("username");
				
				try {
					//load the driver/register
					Class.forName("com.mysql.jdbc.Driver");
					
					
					try {
						//creating a connecion
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
					
						//creating a statement
						PreparedStatement ps=conn.prepareStatement("select * from profile where username=?");
						ps.setString(1,user);	

						//execute the query
						ResultSet resultSet=ps.executeQuery();
						
						if(resultSet.next()) {
							System.out.println("Edit Successful");
							String username=resultSet.getString(1);
							String password=resultSet.getString(2);
							String fullname=resultSet.getString(3);
							String email=resultSet.getString(4);
							String gender=resultSet.getString(5);
							
							
							UserDTO userDTO = new UserDTO(username,password,fullname,email,gender);
							request.setAttribute("userDTO", userDTO);

							request.setAttribute("message", "Record Edited successfully");
							request.getRequestDispatcher("edit.jsp").forward(request,response);
							
							
						}
						else {
							System.out.println("Edit operation not possible");
							
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
