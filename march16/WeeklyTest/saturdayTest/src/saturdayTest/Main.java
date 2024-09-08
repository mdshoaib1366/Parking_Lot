package saturdayTest;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("ab12", "Java");
		
		Student s1 = new Student(111, "AYAN", 50, 50, 50, c1);
		
//		System.out.println(s1.getEnrollmentNumber());
		System.out.println(s1);

	}

}
