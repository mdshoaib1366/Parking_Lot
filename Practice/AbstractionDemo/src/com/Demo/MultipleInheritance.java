package com.Demo;


interface A
{
	void m1();
}
interface B
{
	void m1();
}
class Implementer implements B,A
{
	public void m1()
	{
		System.out.println("Possible Multiple Inheritance...");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		new Implementer().m1();

	}

}
