package com.task.march28;

public class Person {
		private String name;
		private int age;
		
		{
			System.out.println("person Instance created");
		}
		
		Person(String name, int age)
		{
			this.name = name;
			this.age = age;
		}
		public String introduce()
		{
			return "Hi, my name is "+this.name+" and I'm "+this.age+" years old.";
		}
		
}


