package com.may02.lambdaExpr;

interface Printable
{
	void print();
}

public class Lambda {

	public static void main(String[] args) 
	{
		Printable p = () ->
				{
						System.out.println("Hello world");
				};
				
			p.print();
	}

}
