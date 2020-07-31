package edu.kampusdaring.domain;

public class Customer {
    private String name;
	private String address;
	private String mobilePhone;	

	public Customer (String name, String address, String mobilePhone) {
		this.name = name;
		this.address = address;
		this.mobilePhone = mobilePhone;
	}
	
	
	public String introduce() {
		return String.format("Hello, my name is %s, I am from %s", name, address);
	}
	
	public String callMe() {
		return String.format("You may call me at %s", mobilePhone);
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
