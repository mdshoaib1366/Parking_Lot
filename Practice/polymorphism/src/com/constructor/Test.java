package com.constructor;

class Addition1
{
   public Addition1()
   {
	  this(10); 
	  System.out.println("No Argument Constructor");
   }
   public Addition1(int x)
   {
	   this(10,20);
	   System.out.println("One Argument Constructor :"+x);
	   
   }
   public Addition1(int x, int y)
   {
	   super();
	   //This line is reserved for Instance Block
	   System.out.println("Two Argument Constructor :"+x+":"+y);
   }
   
   {
		System.out.println("Instance Block");
   }
}

public class Test {

	public static void main(String[] args) 
	{
		new Addition1();
			
	}
}
