package com.huangsreservationsystem.model.domain;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean 
@SessionScoped
public class CustomerBean implements Serializable{
	/**
	* 
	*/
	private static final long serialVersionUID = 7661657477853633935L;

	/** Customer last name */
	private String lastName;

	/** Customer first name */
	private String firstName;

	/** Customer password */
	private String password;

	/** Customer birthday */
	private String birthday;

	/** Customer userName */
	private String userName;
	
	/**Card type*/
	private String cardType;
	
	/**Customer credit card number*/
	private String cardNumber;
	
	/**Customer credit card expiration date*/
	private String expDate;
	
	/**Customer credit card cvv*/
	private String cvv;
	
	private static final String TAB = "    ";

	/**
	 * Default constructor
	 */
	public CustomerBean() {
	}

	/**
	 * Copy constructor
	 * 
	 * @param customer
	 */
	public CustomerBean(CustomerBean customer) {
		this.lastName = customer.lastName;
		this.firstName = customer.firstName;
		this.userName = customer.userName;
		this.password = customer.password;
		this.birthday = customer.birthday;
		this.cardType = customer.cardType;
		this.cardNumber = customer.cardNumber;
		this.expDate = customer.expDate;
		this.cvv = customer.cvv;

	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param birthday
	 * @param userName
	 */
	public CustomerBean(String lastName, String firstName, String userName, String password, 
			String birthday,String cardType,String cardNumber,String expDate,String cvv) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvv = cvv;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * 
	 * @param birthday
	 * Set the birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * 
	 * @return username
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @param userName
	 * set username
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 
	 * @return card type
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * 
	 * @param cardType
	 * set the card type
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	/**
	 * 
	 * @return card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * 
	 * @param cardNumber
	 * set the card number
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * 
	 * @return credit card expiration date
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * 
	 * @param expDate
	 * Set the expiration date
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	/**
	 * 
	 * @return credit card cvv
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * 
	 * @param cvv
	 * set the credit card cvv
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	/**
	 * 
	 * @return true if non of those are null
	 */
	public boolean validate() {
		if (lastName == null) {
			return false;
		}
		if (firstName == null) {
			return false;
		}
		if (userName == null) {
			return false;
		}
		if (password == null) {
			return false;
		}
		if (birthday == null) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param CustomerBean Validate all the parameter of the customer
	 */
	public boolean equals(CustomerBean customer) {
		if (!lastName.equals(customer.getLastName())) {
			return false;
		}if (!firstName.equals(customer.getFirstName())) {
			return false;
		}if (!userName.equals(customer.getUserName())) {
			return false;
		}if (!password.equals(customer.getPassword())) {
			return false;
		}if(!cardType.equals(customer.getCardType())) {
			return false;
		}if(!cardNumber.equals(customer.getCardNumber())) {
			return false;
		}if(!expDate.equals(customer.getExpDate())){
			return false;
		}if(!cvv.equals(customer.getCvv())) {
			return false;
		}

		return true;
	}

	/**
	 * change the customer object into a string.
	 * 
	 * @return String
	 */
	public String toString() {

		String returnValue = "";

		returnValue = "Welcome to Huangs Hotel Reservation System!!!!!!!!!!!!!!!!!"
				+ "Customer " + super.toString() + TAB + this.lastName + TAB + this.firstName;

		return returnValue;
	}

	@Override
	public int hashCode() {
		final int prime = 7;
		int result = 1;

		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	
	public String update() {
		String nav = "";
		System.out.println("In the update method");
		if (firstName.equals("jay") && lastName.equals("huang")
				&& userName.equals("jayhuang") && password.equals("123456")
				&& cardType.equals("Discover")
				&& cardNumber.equals("1111-2222-3333-4444")
				&& expDate.equals("08/28") && cvv.equals("123")) {
			
			System.out.println("There is no update");
			nav = "availableRoom";
		} else {
			/*
			 * There is an update to the CustomerBean, update the database
			 * For now set to null
			 */
			nav = "avaiableRoom";
		}

		return nav;
	}

}
