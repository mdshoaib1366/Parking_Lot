package com.generic.test;

class Test11<R,A>
{
	private R r;
	public void set(A a) 
	{
		r =  (R)a;
	}
	
	public R get() 
	{
		return r;
	}
}
public class Test2
{
   public static void main(String[] args) 
   {
      Test11<String,String> test = new Test11<String,String>(); 
      test.set("Info");
      System.out.println(test.get());
   }
}
