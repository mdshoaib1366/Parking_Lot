package com.day2;

public class Square {
	public static String getAreaOfSquare(int side)
	{
		if(side==0 || side<0)
			return ""+(-1);
		else {
			return ""+(side*side)+" Square area";
		}
	}
}
