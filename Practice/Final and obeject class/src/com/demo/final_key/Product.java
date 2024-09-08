package com.demo.final_key;

public class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	@Override
	public boolean equals(Object obj){
		
		Product pro = (Product)obj;
		
		if(pro.productId == this.productId && this.productName.equals(pro.productName)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
