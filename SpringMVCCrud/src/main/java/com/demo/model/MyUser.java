package com.demo.model;

public class MyUser {
	private String username;
	private String password;
	private String Role;
	private String Name;
	
	public MyUser() {
		super();
	}

	public MyUser(String username, String password, String role, String name) {
		super();
		this.username = username;
		this.password = password;
		Role = role;
		Name = name;
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

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", Role=" + Role + ", Name=" + Name + "]";
	}

	
	
}
