package com.wellsfargo.batch5.portfolio.entities;

public class User {

	private Integer id;
	private String uname;
	private String password;
	private String role;
	
	public User() {
		System.out.println("default");
	}
	public User(String uname, String password, String role,Integer id) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
}
