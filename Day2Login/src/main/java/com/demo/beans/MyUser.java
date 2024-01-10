package com.demo.beans;

public class MyUser {
	private String uname;
	private String password;
	private String role;
	private String name;
	public MyUser() {
		super();
	}
	public MyUser(String role) {
		this.role=role;
	}
	public MyUser(String uname, String password, String role, String name) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", password=" + password + ", role=" + role + ", name=" + name + "]";
	}
	
	
}
