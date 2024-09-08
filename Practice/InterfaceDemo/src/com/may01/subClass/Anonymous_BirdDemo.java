package com.may01.subClass;

public class Anonymous_BirdDemo {

	public static void main(String[] args) {
		Bird eagle = new Bird()
				{
					public void fly()
					{
						System.out.println("eagle is flying...");
					}
				};
		Bird crow = new Bird()
				{
					public void fly()
					{
						System.out.println("Crow is flying....");
					}
				};
				
				eagle.fly();  crow.fly();
	}

}
