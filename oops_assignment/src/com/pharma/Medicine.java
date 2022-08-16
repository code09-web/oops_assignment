package com.pharma;

import java.util.Date;

public abstract class Medicine {
	Date expiryDate;
	float price;

	public abstract void displayLabel();
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
