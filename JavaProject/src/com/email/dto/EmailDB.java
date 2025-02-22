package com.email.dto;

public class EmailDB {
	
	private String name;
	
	private String mail;
	
	private String Password;
	private String mail_box;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getMail_box() {
		return mail_box;
	}
	public void setMail_box(String mail_box) {
		this.mail_box = mail_box;
	}
	@Override
	public String toString() {
		return "EmailDB [name=" + name + ", mail=" + mail + ", Password=" + Password + ", mail_box=" + mail_box + "]";
	}
	

}
