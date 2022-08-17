package com.card;

import java.util.Scanner;

public class TravelCard extends PrepaidCard implements Rewardable {

	double rewardPoints;

	@Override
	public double rewardPonts(int amount) {
		return (amount / 100) * 5;
	}
	void rechargeCard() {
		System.out.print("Enter Amount To Recharge: ");
		Scanner sc = new Scanner(System.in);
		this.availableBalance=this.availableBalance+sc.nextInt();
		System.out.println("Recharge Successfull ! Current Balance is:"+this.availableBalance);
	}

	@Override
	public boolean swipeCard(int amountOnDoller) {
		int rupess = 60 * amountOnDoller;
		if(rupess > this.availableBalance) {
			return false;	
		}else {
			this.availableBalance =  this.availableBalance-rupess;
			this.rewardPoints = this.rewardPoints + this.rewardPonts(rupess);
			return true;
		}
	}
	void cardinfo() {
		System.out.println("Card Number: "+this.CardNo + "\r\nReward Points: " + this.rewardPoints +"\r\nAvailable Balance: "+ this.availableBalance);
	}

	public static void main(String[] args) {
		TravelCard card = new TravelCard();
		card.CardNo = 112233;
		int userinput = 0;
		boolean exituser = true;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("===== Welcome To Travel Card ======");
		System.out.println("Your Card Number is "+ card.CardNo);
		System.out.println("press 1 to Recharge Card");
		System.out.println("press 2 to Swipe Card");
		System.out.println("press 3 to View Card Info");
		System.out.println("press 0 to exit");
		if(sc.hasNextInt()) {
		    userinput = sc.nextInt();
		}else {
			exituser = false;
		}
		switch(userinput) {
			case 1:
				card.rechargeCard();
				break;
			case 2:
				System.out.print("Enter Amount To Swipe: ");
				int amount = sc.nextInt();
				boolean status = card.swipeCard(amount);
				if(status) {
					System.out.println("Swipe Successfull !");
					card.cardinfo();
				}else {
					System.out.println("Swipe Failed ! Insufficent Funds !");
				}
				break;
			case 3:
				card.cardinfo();
				break;
			case 0:
				exituser = false;
				break;
			default:
				System.out.println("Choose a Correct option");
		}
	}while(exituser);
		
		
	}
	}


