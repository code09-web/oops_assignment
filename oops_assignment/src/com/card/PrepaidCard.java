package com.card;

public abstract class PrepaidCard {
	int CardNo;
	double availableBalance;
	double swipeLimit;
	public abstract boolean swipeCard(int amount);
	
	 @Override
	    public String toString() {
//	        return this.re + " + " + this.im + "i";
		 return "";
	    }
	 public void rechargeCard(int amount) {
		 this.availableBalance += amount;
	 }
	
}
