package com.demo.abc;

class Foo {
	void print() {
		System.out.println("Java Is Awesome");
	}
}
class Doo {
	static Foo foo = new Foo();
	void print()
	{
		System.out.println("Adv Java Is More Awesome");
	}
	public static Foo foo()
	{
		
		return foo;
	}
}
public class Demo {
	public static void main(String[] args) {
		Doo.foo().print();
	}
}
