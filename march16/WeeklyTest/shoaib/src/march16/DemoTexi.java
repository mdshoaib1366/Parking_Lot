package march16;

public class DemoTexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t = new Taxi();
		t.setValue("KANPUR", "LUCKNOW", 569);
		t.calculateTaxiRent();
		t.displayBill(100);
	}

}
