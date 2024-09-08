package com.task.april8;

public class ShapeTester {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		System.out.println("Volume of Cylinder: "+c1.getVolume());
		System.out.println("Area of Circle: "+c1.getArea());
		
		Cylinder c2 = new Cylinder(6,12);
		System.out.println("Volume of Cylinder: "+c2.getVolume());
		System.out.println("Area of Circle: "+c2.getArea());
		
	}

}
