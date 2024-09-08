package com.sat.t2;

public class MainFlight extends Flight {

	
	public MainFlight(String name, String type, String company) {
		super(name, type, company);
		
	}

	public static void main(String[] args) {
		MainFlight mf = new MainFlight("Qatar","bussiness class", "Qatar Airways");
		System.out.println(mf);

	}

}
