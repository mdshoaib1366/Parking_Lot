package com.shoaib.abstractConcept;

public abstract class ATMMachine {
	public abstract void deposit();
	
	public abstract void withdraw();
	
	public abstract void setPin();
	
	public void bankName()
	{
		System.out.println("Punjab Bank");
	}
}
