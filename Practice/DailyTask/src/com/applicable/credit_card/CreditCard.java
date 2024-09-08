package com.applicable.credit_card;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("RAJ", 1300);
//		System.out.println(c1);
		CardType obj = CardOnOffer.getOfferedCard(c1);
		System.out.println(obj);
	}

}
