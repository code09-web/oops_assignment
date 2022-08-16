package com.card;

public class TravelCard extends PrepaidCard implements Rewardable {

	double rewardPoints;

	@Override
	public double rewardPonts(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean swipeCard(int amountOnDoller) {
		double rupess  = 60 * amountOnDoller;
		if(super.swipeLimit>rupess  && super.availableBalance>rupess ) {
			double a = (rupess *100)/5;
		}
		return false;
	}
	public static void main(String[] args) {
		float a =  50*5 / 100;
		System.out.println(a);
	}

}
