package com.may09.task1;

import java.util.function.Consumer;

public class Tester {

	public static void main(String[] args) {
		CartItem c1 = new CartItem("nike Dior", 300000, 10);
		ShoppingCart s = new ShoppingCart(c1);
		Consumer<ShoppingCart> dis = sc -> {
//			if(c1.getTotalPrice()>1000000)
//			{
//				double bill = c1.getTotalPrice()-(c1.getTotalPrice()*0.1);
//				System.out.println("Discount: "+(c1.getTotalPrice()*0.1));
//				System.out.println("Total  Bill: "+bill);
//			}
			
					double total_bill=sc.getItems().getTotalPrice();
					if(total_bill>1000000)
					{
						double discount = total_bill-total_bill*0.1;
						System.out.println("Discount: "+total_bill*0.1);
						System.out.println("total Bill: "+discount);
					}
					else
					{
						System.out.println("Total Bill: "+total_bill);
					}
		};
		
		dis.accept(s);
		System.out.println(c1);
		System.out.println("Total Price: "+c1.getTotalPrice());

	}

}
