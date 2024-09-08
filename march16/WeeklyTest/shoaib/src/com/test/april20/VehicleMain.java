package com.test.april20;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c1 = new Car(20);
		System.out.println("Vehicle speed: "+c1.getSpeed()+"km");
		c1.speedUp(280);
		
		Vehicle b1 = new Bike(30);
//		System.out.println();
		b1.speedUp(420);
	}
}
