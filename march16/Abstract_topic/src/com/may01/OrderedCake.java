package com.may01;

public class OrderedCake extends Cake {

	private String message;

	public OrderedCake()
	{
		super();
		
	}
	
	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
		
	}

	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}
	
	protected void showCake()
	{
		
//		System.out.println("A "+super.getShape()+" Cake Of "+ super.getFlavour()+" having thr qty" 
//				                      +super.getQty()+" of rs."+super.getPrice()*super.getQty()+" is ready");
	
		if(message==null || message==" ")
		{
			super.showCake();
		}
		else{
		System.out.println("A "+super.getShape()+" "+super.getFlavour()+
				" Cake of "+super.getQty()+" Kg/Kg's ready with message "+this.message+" Day @ Rs."
				+super.getPrice()*super.getQty()+"/-");
		}
	}
	
}
