package com.day4;

public class WholeSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bill = Integer.parseInt(args[0]);
		int dis;
		if(bill<5000)
		{
			System.out.println("Discount: 5%");
			dis = (bill*5/100);
		}
		else if(bill>=5000 && bill<10000)
		{
			System.out.println("Discount: 10%");
			dis = (bill*10/100);
		}
		else
		{
			System.out.println("Discount: 15%");
			dis = (bill*15/100);
		}
		
		System.out.println("Discount Amount: "+dis);
		System.out.println("Amount Payable: "+(bill-dis));
	}

}
