package com.overriding.april17;

public class Test1 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.show();
		System.out.println(rec.computeArea());
		rec.show();
		System.out.println("=====================================");
		
		Cuboid cub = new Cuboid();
		cub.show();
		System.out.println(cub.computeArea());
;	}
}
