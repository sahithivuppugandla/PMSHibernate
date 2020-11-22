package com.wellsfargo.batch5.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="super_user")
public class SuperUser extends UserLogin {

	@Column(name="admin_email")
	private String superUserEmail;
	
	public SuperUser() {
		System.out.println("default");
	}
	
	public SuperUser(String uname, String password, String role, String superUserEmail) {
		super();
		this.superUserEmail = superUserEmail;
	}

	public String getSuperUserEmail() {
		return superUserEmail;
	}

	public void setSuperUserEmail(String superUserEmail) {
		this.superUserEmail = superUserEmail;
	}

}
