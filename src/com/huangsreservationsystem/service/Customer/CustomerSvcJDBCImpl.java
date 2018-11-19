package com.huangsreservationsystem.service.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.huangsreservationsystem.model.domain.CustomerBean;

public class CustomerSvcJDBCImpl implements ICustomerSvc {

	public boolean updateDatabaseService(CustomerBean customer) {
		System.out.println("Entering method CustomerSvcJDBCImpl:" + "Customer will be able to update their information"
				+ "in the database.");
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/jay");
			// Get the connection, make sure you have the sql.connection not jdbc connection
			Connection cnnt = ds.getConnection();
			Statement stmt = cnnt.createStatement();
			System.out.println("Successfully make a connection to the database");
			
//			ResultSet resultSet = stmt.executeQuery("SELECT * FROM customer");
//			while (resultSet.next()) {
//				System.out.println("Not a empty result list.");
//			}
			String lastName = customer.getLastName();
			String firstName = customer.getFirstName();
			String userName = customer.getUserName();
			String password = customer.getPassword();
			String birthday = customer.getBirthday();
			String cardType = customer.getCardType();
			String cardNumber = customer.getCardNumber();
			String exp = customer.getExpDate();
			String cvv = customer.getCvv();
			
			String updatequery = String.format(
					"UPDATE customer SET lastName = '%s',"
					+ "firstName = '%s',"
					+ "userName = '%s',"
					+ "passWord = '%s',"
					+ "birthday = '%s',"
					+ "cardType = '%s',"
					+ "expDate = '%s',"
					+ "cvv = '%s'"
					+ "WHERE idCustomer = 1", 
					lastName,firstName,userName,password,birthday,cardType,cardNumber,exp,cvv);
			int result = stmt.executeUpdate(updatequery);
			System.out.println("The result is "+result);
			
			// Close the statement
			stmt.close();
			// Close the database connection
			cnnt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
