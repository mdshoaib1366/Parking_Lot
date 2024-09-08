package com.may01.task2;

public class Bread extends Food {

	private int tastyScore = 8;
	private String type = "vegetarian";

	public Bread(double proteins,double fats,double carbs) {
		super(proteins, fats, carbs);
	}
	
	
	
	public String getType() {
		return type;
	}



	@Override
	void getMacroNutrients() {
		System.out.println(super.getClass().getSimpleName()+" is "+this.type);
		System.out.println("A slice of bread has "+this.proteins+" gms of protein, "
				+this.fats+" gms of fats and "
				+this.carbs+" gms of carbohydrates.");
		System.out.println("Tasty Score: "+this.tastyScore);
	}

}
