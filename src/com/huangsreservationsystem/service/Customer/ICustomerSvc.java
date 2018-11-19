package com.huangsreservationsystem.service.Customer;

import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.service.IService;

public interface ICustomerSvc extends IService{
	
	final String NAME = "ICustomerSvc";
	
	public boolean updateDatabaseService(CustomerBean customer);
}
