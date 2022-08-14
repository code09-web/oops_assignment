package com.oops;

public class Customer {
	private String customerName;
	private Address residentialAddress;

	public Customer() {
		super();
	}

	public Customer(String customerName, Address residentialAddress) {
		super();
		this.setCustomerName(customerName);
		this.setResidentialAddress(residentialAddress);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerDetails() {
		return "Customer: " + this.getCustomerName() + "\n" + "Residential Address :"
				+ this.residentialAddress.getAddressDetails();
	}

}
