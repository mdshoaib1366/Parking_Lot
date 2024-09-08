package com.shoaib.first;

public class AreaOfRectangle {
		public static void main(String[] args) {
			
			int length = Integer.parseInt(args[0]);
			int bredth = Integer.parseInt(args[1]);
			
			int area = length*bredth;
			
			System.out.println("Area of Rectangle: "+area);
			
		}
}
