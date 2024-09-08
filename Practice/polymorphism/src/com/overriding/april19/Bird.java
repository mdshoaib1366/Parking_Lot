package com.overriding.april19;

public class Bird extends Animal {

	boolean canFly;

	public Bird(String species,boolean canFly) {
		super(species);
		this.canFly = canFly;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println(super.getSpecies()+" sound ");
	}

	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + "]";
	}
	
	@Override
	public Bird reproduce()
	{
		System.out.println(super.getSpecies()+" lay eggs as a means of reproduction.");
		return new Bird(super.getSpecies(),canFly);
	}
	
	public void buildNest()
	{
		System.out.println(super.getSpecies()+" building nests for their eggs.");
	}
}
