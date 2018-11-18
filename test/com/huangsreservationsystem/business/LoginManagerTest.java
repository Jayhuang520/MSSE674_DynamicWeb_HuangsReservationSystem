package com.huangsreservationsystem.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.model.domain.LoginBean;

public class LoginManagerTest {

	@Test
	public void testLogin() {
		LoginBean login = new LoginBean();
		login.setUserName("jayhuang");
		login.setPassword("123456");
		CustomerBean customer = LoginManager.authenticateLogin(login);
		assertNotNull("Failed to authenticate",customer);
	}

}
