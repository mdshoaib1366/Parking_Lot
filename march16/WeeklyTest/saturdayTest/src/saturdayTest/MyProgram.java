package saturdayTest;

public class MyProgram {

	public static void main(String[] args) {
		Movie m = new Movie("HERO", 2001, "Action");
		m.getTitle();
		m.getReleaseYear();
		m.getGenre();
		
		System.out.println(m);
		m.setGenre("Action");
		m.setReleaseYear(2023);
		m.setTitle("JAWAN");
		System.out.println(m);
	}

}
