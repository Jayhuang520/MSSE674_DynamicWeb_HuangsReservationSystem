package com.huangsreservationsystem.business;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.service.Customer.ICustomerSvc;
import com.huangsreservationsystem.service.factory.ServiceFactory;

public class UpdateProfileManager {
	public UpdateProfileManager() {
	}

	public static CustomerBean update(CustomerBean customerBean) throws Exception {
		
		CustomerBean cb = new CustomerBean();
		if (customerBean.getFirstName().equals("jay") && customerBean.getLastName().equals("huang")
				&& customerBean.getUserName().equals("jayhuang") && customerBean.getPassword().equals("123456")
				&& customerBean.getCardType().equals("Discover")
				&& customerBean.getCardNumber().equals("1111-2222-3333-4444")
				&& customerBean.getExpDate().equals("08/28") && customerBean.getCvv().equals("123")) {
			cb = customerBean;
		} else {
			/*
			 * There is an update to the CustomerBean, update the database
			 * For now set to null
			 */
			System.out.println("Inside the update method:Try to udpate the database");
			ServiceFactory factory = ServiceFactory.getInstance();
			   ICustomerSvc custSvc= (ICustomerSvc)factory.getService (ICustomerSvc.NAME);		
				// now use the ICustomerSvc service 
			custSvc.updateDatabase();
			cb = null;
		}

		return cb;
	}
}
