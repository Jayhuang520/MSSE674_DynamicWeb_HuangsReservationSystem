package com.huangsreservationsystem.service.Customer;

public class CustomerSvcJDBCImpl implements ICustomerSvc{
	
	public void updateDatabase() {
		System.out.println("Entering method CustomerSvcJDBCImpl:"
				+ "Customer will be able to update their information"
				+ "in the database.");
	}
}
