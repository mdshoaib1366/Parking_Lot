package com.applicable.credit_card;

public class CardOnOffer {
	public static CardType getOfferedCard(Customer c)
	{
		int score = c.getCreditPoints();
		if(score>100 && score<500)
		{
			return new CardType(c, "Silver");
		}
		else if(score>501 && score<1000)
		{
			return new CardType(c, "Gold");
		}
		else if(score>1000)
		{
			return new CardType(c, "Platinum");	
		}
		else 
		{
			return new CardType(c, "EMI");
		}
	}
}
