package com.huangsreservationsystem.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.huangsreservationsystem.model.domain.CustomerBean;

public class UpdateProfileManagerTest {

	@Test
	public void test() throws Exception {
		CustomerBean customer = new CustomerBean();
		customer.setFirstName("jay");
		customer.setLastName("huang");
		customer.setUserName("jayhuang");
		customer.setPassword("123456");
		customer.setBirthday("08/18/1994");
		customer.setCardType("Discover");
		customer.setCardNumber("1111-2222-3333-4444");
		customer.setExpDate("08/28");
		customer.setCvv("123");
		
		CustomerBean test = UpdateProfileManager.update(customer);
		
		assertNotNull("There is no update",test);
	}
}
