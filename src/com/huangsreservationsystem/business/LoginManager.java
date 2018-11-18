package com.huangsreservationsystem.business;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.model.domain.LoginBean;

public class LoginManager {
	public LoginManager() {
	}
	
	/**
	 * This method authenticate the username = jayhuang
	 * and the password equals to 123456.
	 * TODO:Insert the username and password in the database.
	 * @param login
	 * @return
	 */
	public static CustomerBean authenticateLogin(LoginBean login) {
		CustomerBean customer = new CustomerBean();
		
		if ((login.getUserName().equals("jayhuang")) && (login.getPassword().equals("123456"))) {
			customer.setUserName(login.getUserName());
			customer.setPassword(login.getPassword());
		} else {
			customer = null;
		}
		
		return customer;
	}
}
