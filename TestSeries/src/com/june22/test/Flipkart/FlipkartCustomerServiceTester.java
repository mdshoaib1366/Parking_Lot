package com.june22.test.Flipkart;

import java.util.Scanner;

public class FlipkartCustomerServiceTester {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		
		FlipkartCustomer fk = null;
		
			for(int i=0; i<3; i++) {
//				int id = s.nextInt();
//				String name = s.next();
				
				
				
				fk=new FlipkartCustomer(11,"rahul","rahul@gmail.com","hyd",6,"9876543321");
	}
//		FlipkartCustomer fk1 = new FlipkartCustomer();
		
		FlipkartCustomerService fs = new FlipkartCustomerService(fk);
		fs.addFlipkartCustomer(fk);
		System.out.println(fs.isFirstCustomer(fk));;
		System.out.println(fs.calculateBill(fk));;
		
		
	
	}
}
