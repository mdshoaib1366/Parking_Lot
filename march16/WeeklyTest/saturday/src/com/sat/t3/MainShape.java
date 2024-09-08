package com.sat.t3;

public class MainShape {
	public static void main(String[] args) {
		Square s = new Square(10);
		System.out.println("Area: "+s.getArea());
		System.out.println("Parimeter: "+s.getPerimeter());
		
		System.out.println("===========================================");
		
		Triangle t = new Triangle(10.0, 20.0, 5.0, 15.0, 25.0);
		System.out.println("Area: "+t.getArea());
		System.out.println("Perimater: "+t.getPerimeter());
	}
}
