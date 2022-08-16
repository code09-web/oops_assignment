package com.customer;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress;
	public Customer() {
		super();
	}

	public Customer(String customerName, Address residentialAddress,Address officialAddress) {
		super();
		this.setCustomerName(customerName);
		this.setResidentialAddress(residentialAddress);
		this.setOfficialAddress(officialAddress);
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
				+ this.residentialAddress.getAddressDetails()+ "\n" + "Official Address :"
						+ this.officialAddress.getAddressDetails();
	}

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

}
