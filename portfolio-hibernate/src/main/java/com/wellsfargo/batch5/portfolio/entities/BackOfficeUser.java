package com.wellsfargo.batch5.portfolio.entities;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bro_users")
public class BackOfficeUser extends UserLogin{

	private String BackOfficeUserEmail;

	public BackOfficeUser() {
		System.out.println("default");
	}

	public BackOfficeUser(String uname, String password, String role,String backOfficeUserEmail) {
		super();

		BackOfficeUserEmail = backOfficeUserEmail;
	}

	public String getBackOfficeUserEmail() {
		return BackOfficeUserEmail;
	}

	public void setBackOfficeUserEmail(String backOfficeUserEmail) {
		BackOfficeUserEmail = backOfficeUserEmail;
	}

}
