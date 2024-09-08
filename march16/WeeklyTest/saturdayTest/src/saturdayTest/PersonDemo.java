package saturdayTest;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1= new Person("AJAY",23);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println("-------------------");
		
		p1.setName("MOHIT");
		p1.setAge(21);
		System.out.println(p1);
		
		Person p2 = new Person(p1);
		
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		System.out.println("-------------------");
		
		p2.setName("JOY");
		p2.setAge(31);
		System.out.println(p2);
	}

}
