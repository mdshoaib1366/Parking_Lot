package com.lab_task.april01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie("Raaz", 2006, "Horror");
		System.out.println(m);
		System.out.println("=============================");
		System.out.println(m.getTitle());
		System.out.println(m.getReleaseyear());
		System.out.println(m.getGenre());
		m.setTitle("Dhol");
		m.setReleaseyear(2012);
		m.setGenre("Comedy");
		
		System.out.println("==================================");
		System.out.println(m);
	}

}
