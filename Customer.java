package com.company;

class Customer {
	private String name;
	private String phoneNo;
	private String address;

	public Customer(String address, String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}