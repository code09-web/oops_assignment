package com.pharma;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[6];
		Random random = new Random();
		int randomNumber = random.nextInt(3) + 1;
		if(randomNumber==1) {
			Tablet tablet = new Tablet();
			tablet.getDetails(10, "09-03-2025", "Cordarone");
			tablet.displayLabel();
		}else if(randomNumber == 2) {
			Syrup syrup = new Syrup();
			syrup.getDetails(50, "19-03-2023", "Multani Kuka Cough Syrup");
			syrup.displayLabel();
		}else if(randomNumber ==3) {
			Ointement ointement = new Ointement();
			ointement.getDetails(30, "19-03-2027", "Mild Steroid");
			ointement.displayLabel();
		}

	}

}
