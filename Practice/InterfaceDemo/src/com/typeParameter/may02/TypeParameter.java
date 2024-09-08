package com.typeParameter.may02;

class Accept<T>
{
	private T x;
	
	public Accept(T x)
	{
		super();
		this.x = x;
	}
	
	public T getX()
	{
		return x;
	}
	
}

public class TypeParameter {
	public static void main(String[] args) {
		Accept<Integer> intType = new Accept<Integer>(12);
		System.out.println(intType.getX());
		
		Accept<String> stringType = new Accept<String>("hiii");
		System.out.println(stringType.getX());
		
		Accept<Student> objType = new Accept<Student>(new Student(1,"john"));
		System.out.println(objType.getX());
	}
}



record Student(int roll, String name)
{
	
}
