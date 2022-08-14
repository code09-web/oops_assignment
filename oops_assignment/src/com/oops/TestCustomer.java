package com.oops;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Address residentialAddress = new Address("Ist Main HSR Layout", "Bangalore");
		customer.setCustomerName("Jone");
		customer.setResidentialAddress(residentialAddress);
		/*
		 * • Create an object of Customer with default constructor. Use setters to
		 * assign values to the member variables. Display the values of member variables
		 * using getters.
		 */

		System.out.println(customer.getCustomerName() + " , " + customer.getResidentialAddress().getAddressLine() + " "
				+ customer.getResidentialAddress().getCity());

		/*
		 * • Create an object of Customer using parameterized constructor and display
		 * all the details of the customer using getCustomerDetails method
		 */

		System.out.println(new Customer("jone",residentialAddress).getCustomerDetails());

	}

}
