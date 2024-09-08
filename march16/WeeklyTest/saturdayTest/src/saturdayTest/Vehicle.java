package saturdayTest;

public class Vehicle {
	private String brand;
	private String model;
	private int year;

	public Vehicle(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public Vehicle(Vehicle v)
	{
		this.brand = v.brand;
		this.model = v.model;
		this.year = v.year;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}
	
	
}
