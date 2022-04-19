package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/allRecord")
public class AllRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		
		try {
			//load the driver/register
			Class.forName("com.mysql.jdbc.Driver");
		
			
			try {
				//creating a connection
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","root");
			
				//creating a statement
				PreparedStatement ps=conn.prepareStatement("select * from profile");
			
				
				//execute query
				ResultSet resultSet=ps.executeQuery();
				
				//creating arrayListfor storing all the records
				List<UserDTO> userList=new ArrayList<>();
				
				while(resultSet.next()) {
					
					String username=resultSet.getString(1);
					String password=resultSet.getString(2);
					String name=resultSet.getString(3);
					String email=resultSet.getString(4);
					String gender=resultSet.getString(5);
				
					
					UserDTO userDTO=new UserDTO(username,password,name,email,gender);
					userList.add(userDTO);
				}
				
					request.setAttribute("userList", userList);
					
					
					request.getRequestDispatcher("allUser.jsp").forward(request, response);
				
				
			
			
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
