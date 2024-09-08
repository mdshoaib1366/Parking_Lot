package com.june01.task;

public class CoffeeOrder {
	private CoffeeType type;
	private CoffeeSize size;

	public CoffeeOrder(CoffeeType type, CoffeeSize size) {
		super();
		this.type = type;
		this.size = size;
	}

	public String getOrderDetails()
	{
		String s="";
		if(type.equals(type.Black_coffee) )
		{
			if(size.equals(size.Small))
			{
				return s+="you ordered Black coffee (small).";
			}
			else if(size.equals(size.Medium))
			{
				return s+="you ordered Black coffee (medium).";
			}
			else
			{
				return s+="you ordered Black coffee (large).";
			}
			
		}
		else if(type.equals(type.cold_coffee))
		{
			if(size.equals(size.Small))
			{
				return s+="you ordered Cold coffee (small).";
			}
			else if(size.equals(size.Medium))
			{
				return s+="you ordered Cold coffee (medium).";
			}
			else
			{
				return s+="you ordered Cold coffee (large).";
			}
		}
		else if(type.equals(type.milk_coffee))
		{
			if(size.equals(size.Small))
			{
				return s+="you ordered Milk coffee (small).";
			}
			else if(size.equals(size.Medium))
			{
				return s+="you ordered Milk coffee (medium).";
			}
			else
			{
				return s+="you ordered Milk coffee (large).";
			}
		}
		return s;
	}
}
