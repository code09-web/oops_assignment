package com.pharma;


public abstract class Medicine {
	String expiryDate,name;
	float price;
	

	public abstract void displayLabel();
	public void getDetails(float price, String expiryDate,String name) {
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("expiryDate:"+expiryDate);
	}
}

class Tablet extends Medicine {

	@Override
	public void displayLabel() {
		System.out.println("store in a cool dry place");
	}

}

class Syrup extends Medicine {

	@Override
	public void displayLabel() {
		System.out.println("store in a cool dry place");
	}

}

class Ointement extends Medicine {

	@Override
	public void displayLabel() {
		System.out.println("for external use only");
	}

}
