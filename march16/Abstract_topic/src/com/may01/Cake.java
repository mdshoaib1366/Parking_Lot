package com.may01;

public abstract class Cake {
	private String shape;
	private String flavour;
	private int qty;
	private float price=400;

	   Cake(){
		    this.shape="Round";
		    this.flavour="vanilla";
		    this.qty=1;
	   }
	protected Cake(String shape, String flavour, int qty) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.qty = qty;
		
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	protected void showCake()
	{
		System.out.println("A "+shape+" Vanilla Cake Of "+qty+" Kg/Kg's Ready @ Rs."+this.qty*this.price+" /-");
	}

}
