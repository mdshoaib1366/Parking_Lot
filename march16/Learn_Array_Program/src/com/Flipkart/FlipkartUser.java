package com.Flipkart;

import java.util.Scanner;

public class FlipkartUser {

	public static void main(String[] args) {
		FlipKart f = new FlipKart();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		FlipKart product[] = new FlipKart[size];
		f.insert(product,sc);
//		f.print(product);
		FlipKart []result = f.requirement(product);
		for(FlipKart res: result)
		{
			System.out.println(res);
		}
		
//		FlipKart f1 = new FlipKart(11,"mobile",12,20000);
//		FlipKart f2 = new FlipKart(12,"camera",10,10000);
//		FlipKart f3 = new FlipKart(13,"bottle",5,2000);
//		FlipKart f4 = new FlipKart(14,"laptop",12,60000);
//		FlipKart f5 = new FlipKart(15,"trimmer",10,4000);
//		
//		FlipKart products[] = {f1,f2,f3,f4,f5};
//		
	}

}
