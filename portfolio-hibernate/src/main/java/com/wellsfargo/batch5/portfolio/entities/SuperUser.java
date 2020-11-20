package com.wellsfargo.batch5.portfolio.entities;

public class SuperUser extends User{

	private String superUserName;
	private String superUserEmail;
	private String backOfficeUserID;
	private String backOfficePwd;
	
	public SuperUser() {
		System.out.println("default");
	}
	
	
	public SuperUser(String superUserName, String superUserEmail, String backOfficeUserID, String backOfficePwd) {
		super();
		this.superUserName = superUserName;
		this.superUserEmail = superUserEmail;
		this.backOfficeUserID = backOfficeUserID;
		this.backOfficePwd = backOfficePwd;
	}


	public String getSuperUserName() {
		return superUserName;
	}
	public void setSuperUserName(String superUserName) {
		this.superUserName = superUserName;
	}
	public String getSuperUserEmail() {
		return superUserEmail;
	}
	public void setSuperUserEmail(String superUserEmail) {
		this.superUserEmail = superUserEmail;
	}
	public String getBackOfficeUserID() {
		return backOfficeUserID;
	}
	public void setBackOfficeUserID(String backOfficeUserID) {
		this.backOfficeUserID = backOfficeUserID;
	}
	public String getBackOfficePwd() {
		return backOfficePwd;
	}
	public void setBackOfficePwd(String backOfficePwd) {
		this.backOfficePwd = backOfficePwd;
	}
	
	
}
