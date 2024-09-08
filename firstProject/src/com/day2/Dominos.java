package com.day2;

public class Dominos {
	public static void main(String[] args) {
		System.out.println("\t\t------welcome to Dominos------");
		System.out.println();
		int cRoll = 60;
		int vPuff = 25;
		int price,total;
		price = 4*cRoll + 3*vPuff;
		System.out.println("\t\tChicken roll Price 60 Qty  : "+4+" , Total For Chicken Roll : "+(4*cRoll));

		System.out.println("\t\tPuffs Price 25 Qty  : "+3 + " , Total For Puffs : "+(3*vPuff));
//		System.out.println("\t\t4 chicken:"+(4*cRoll)+" and 3 Puffs: "+(3*vPuff));
		total = price - 50;
		System.out.println();
		System.out.println("\t\tfinal bill: "+total);
		System.out.println();
		System.out.println("\t\t------Thank you visit again----");
	}
}
