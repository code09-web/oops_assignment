package com.oops;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Address residentialAddress = new Address("Ist Main HSR Layout", "Bangalore");
		customer.setCustomerName("Jone");
		customer.setResidentialAddress(residentialAddress);
		System.out.println(customer.getCustomerName() + " , " + customer.getResidentialAddress().getAddressLine() + " "+ customer.getResidentialAddress().getCity());

	}

}
