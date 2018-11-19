package com.huangsreservationsystem.service.Customer;

import org.junit.Test;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.service.factory.ServiceFactory;

import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.TestCase;

public class CustomerServiceImplTest extends TestCase{
	private ServiceFactory serviceFactory;
	
	protected void setUp() throws Exception{
		super.setUp();
		
		serviceFactory = ServiceFactory.getInstance();
		
	}
	
	@Ignore
	@Test
	public void test() {
		try {
			CustomerSvcJDBCImpl customerImpl = new CustomerSvcJDBCImpl();
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
			assertTrue(customerImpl.updateDatabaseService(customer));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
