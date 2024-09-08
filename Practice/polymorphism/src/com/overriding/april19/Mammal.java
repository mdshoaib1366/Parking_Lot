package com.overriding.april19;

public class Mammal extends Animal {

	boolean hasFur;

	public Mammal(String species, boolean hasFar) {
		super(species);
		this.hasFur = hasFar;
	}

	@Override
	public void makeSound() {
		System.out.println(super.getSpecies()+" sound ");
	}

	@Override
	public String toString() {
		return "Mammal [hasFur=" + hasFur + "]";
	}
	
	@Override
	public Mammal reproduce()
	{
		System.out.println(super.getSpecies()+" give birth to live young.");
		return new Mammal(super.getSpecies(),this.hasFur);
	}
	
	public void nurseYoung()
	{
		System.out.println(super.getSpecies()+" nursing their young.");
	}
}
