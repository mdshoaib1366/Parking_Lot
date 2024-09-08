package saturdayTest;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("BMW","X3",2020);
		
		Vehicle v2 = new Vehicle(v1);
		
		
		System.out.println(v2);
	}

}
