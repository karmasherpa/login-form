package com.servlet;

public class UserDTO {
	
	//pojo class
	String username;
	String password;
	String fullname;
	String email;
	String gender;
	
	public UserDTO(String username, String password, String fullname, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", password=" + password + ", fullname=" + fullname + ", email="
				+ email + ", gender=" + gender + "]";
	}
	
	
	
	
}
