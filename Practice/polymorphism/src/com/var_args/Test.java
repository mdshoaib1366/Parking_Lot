package com.var_args;

 class Exam
{
  public void input(int... x)  //Array
  {
//	  System.out.println("Var args executed"+x);
	  for(int z : x)
	  {
		  System.out.println(z);
	  }
  }
}

public class Test {

	public static void main(String ...x)
	{ 			
		Exam t1 = new Exam();
		t1.input();
		t1.input(12);
		t1.input(15,19);
		t1.input(10,20,30);
		t1.input(10,20,30,40);
		t1.input(10,20,30,40,50);
								
	}

}
