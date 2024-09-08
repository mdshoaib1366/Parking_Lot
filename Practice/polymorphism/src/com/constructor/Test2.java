package com.constructor;

class Sum
{
  public int add(int x, int y)
  {
	  int z = x+y;
	  return z;	  
  }
  
  public String add(String x, String y) //data base
  {
	  String z = x+y;
	  return z;
  }

  public double add(double x, double y)
  {
	  double z = x+y;
	  return z;
  }
}
  

public class Test2
{
	public static void main(String[] args) 
	{
		Sum s1 = new Sum();
		String add = s1.add("Data", "base");
		
		int x = s1.add(12, 12);
		
		double y = s1.add(12.89, 12.90);
		
		
		System.out.println(add+" : "+x+" : "+y);

	}
}
