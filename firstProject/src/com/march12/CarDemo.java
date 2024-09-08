package com.march12;

public class CarDemo {

	public static void main(String[] args) {
		Car ferrari = new Car();
		ferrari.brandName = "Ferrari ev";
		ferrari.vehicleNumber = "UP32HP1234";
		ferrari.price = 8900000;
		ferrari.seat = 2;
		ferrari.tyre = 4;
		ferrari.getdata();
		ferrari.startEngine();
		ferrari.accelarate();
		ferrari.stopCar();
	}

}
