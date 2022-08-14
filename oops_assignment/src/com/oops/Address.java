package com.oops;

public class Address {
	private String addressLine, city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressDetails() {
		return this.getAddressLine()+", "+ this.getCity();
	}

	public static void main(String[] args) {

	}
}
