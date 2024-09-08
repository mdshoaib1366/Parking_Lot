package com.var_args;

 class Test1
{
      //All commented codes are invalid
	
		/**
		  public void accept(float ...x, int ...y) { }
		  
		  public void accept(int ...x, int y) { }
		  
		  public void accept(int...x, int ...y) {}
		 */
	 
	 

	public void accept(int x, int... y) // valid
	{
		System.out.println("x value is :"+x);
		for (int z : y) 
		{
			System.out.println(z);
		}
	}
}

public class Main {

	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.accept(100, 200,300,400,500);
	}
}
