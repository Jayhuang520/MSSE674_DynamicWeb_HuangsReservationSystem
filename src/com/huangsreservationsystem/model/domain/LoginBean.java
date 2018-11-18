package com.huangsreservationsystem.model.domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean 
@SessionScoped
public class LoginBean {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String validateUserLogin() {
		String navResult = "";
		System.out.println("Entered Username is= " + userName + ", password is= " + password);
		if (userName.equalsIgnoreCase("jayhuang") && password.equals("123456")) {
			System.out.println("Match password,direct to success");
			navResult = "success";
		} else {
			System.out.println("Not match password, direct to failed");
			navResult = "failure";
		}
		return navResult;
	}
}