package com.getterAnd.setterExample;

public class X {
	static int a = 10;
	int x = 245;
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		System.out.println("-----Before Modifying---------");
		System.out.println(x1);
		System.out.println(x2);
		x1.x  = 345;
		x2.x = 4445;
		System.out.println("-----After Modifying---------");
		System.out.println(x1);
		System.out.println(x2);
		x2.a = 30;
		System.out.println("-----After Modifying Static---------");
		System.out.println(x1);
		System.out.println(x2);
	}
	@Override
	public String toString() {
		return "X [x=" + x + "]" + " - " + a;
	}
	
}
