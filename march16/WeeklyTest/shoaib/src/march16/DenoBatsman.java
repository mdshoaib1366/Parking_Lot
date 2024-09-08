package march16;

public class DenoBatsman {

	public static void main(String[] args) {
		Batsman b = new Batsman();
		b.name = "Virat";
		b.runs = 300;
		b.matches = 7;
		b.computeBattingAverage();
		b.getStatics();
	}

}
