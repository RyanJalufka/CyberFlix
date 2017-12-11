package edu.txstate.internet.cyberflix.data.db;

public class Customer {
	
	private int cus_id;
	private String cus_firstName;
	private String cus_lastName;
	private String cus_emailAddress;
	private String cus_password;
	
	Customer(int id, String firstName, String lastName, String emailAddress, String password) {
		this.cus_id = id;
		this.cus_firstName = firstName;
		this.cus_lastName = lastName;
		this.cus_emailAddress = emailAddress;
		this.cus_password = password;
	}
	
	Customer() {
	}
	
	public int getId() {
		return cus_id;
	}
	public String getFirstName() {
		return cus_firstName;
	}
	public String getLastName() {
		return cus_lastName;
	}
	public String getEmail() {
		return cus_emailAddress;
	}
	public String getPassword() {
		return cus_password;
	}
	
	public void setID(int id) {
		this.cus_id = id;
	}
	public void setFirstName(String firstname) {
		this.cus_firstName = firstname;
	}
	public void setLastName(String lastname) {
		this.cus_lastName = lastname;
	}
	public void setEmail(String emailAddress) {
		this.cus_emailAddress = emailAddress;
	}
	public void setPassword(String password) {
		this.cus_password = password;
	}
	
	@Override
	public String toString() {
		return "Customer [ID: " + cus_id + ", First Name: " + cus_firstName + ", Last Name: " + cus_lastName + ", Email: " + cus_emailAddress + ", Password: " + cus_password + "]";
	}
}
