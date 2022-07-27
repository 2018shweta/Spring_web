package com.bean;

import org.hibernate.validator.constraints.NotBlank;

public class LoginUserBean {
    @NotBlank
	String firstNeam;
    @NotBlank
	String password;
    @NotBlank
	String email;
	public String getFirstNeam() {
		return firstNeam;
	}
	public void setFirstNeam(String firstNeam) {
		this.firstNeam = firstNeam;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
