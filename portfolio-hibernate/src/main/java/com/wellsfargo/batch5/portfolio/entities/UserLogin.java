package com.wellsfargo.batch5.portfolio.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Inheritance(strategy=InheritanceType.JOINED)
public class UserLogin {

	@Id
	@Column(name="userName")
	private String uname;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	public UserLogin() {
		System.out.println("default");
	}
	public UserLogin(String uname, String password, String role) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
		
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
