package models;

public class Customer {
	private String name;
	private String address;
	private String paypalAccountEmail;
	 
	public Customer(String name, String address, String paypalAccountEmail) {
		this.name = name;
		this.address = address;
		this.paypalAccountEmail = paypalAccountEmail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPaypalAccount() {
		return paypalAccountEmail;
	}
	
	public void setPaypalAccount(String paypalAccount) {
		this.paypalAccountEmail = paypalAccount;
	}
	
}
