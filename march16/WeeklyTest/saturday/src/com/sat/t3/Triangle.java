package com.sat.t3;

public class Triangle {
	private double height;
	private double width;
	private double side1;
	private double side2;
	private double side3;

	

	public Triangle(double height, double width, double side1, double side2, double side3) {
		super();
		this.height = height;
		this.width = width;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getPerimeter() {
		return side1+side2+side3;
	}

	public double getArea() {
		return (width*height)/2;
	}
}
