package march16;

public class Taxi {
		private String startPoint;
		private String endPoint;
		private int distance;
		public int cost;
		public void setValue(String sp, String ep,int dis)
		{
			startPoint = sp;
			endPoint = ep;
			distance = dis;
		}
		public void calculateTaxiRent()
		{
			if(distance<=100)
			{
				 cost = distance*7+200;
//				System.out.println("cost: "+cost);
			}
			else if(distance>100 && distance <300)
			{
				 cost = distance*8+500;
//				System.out.println("cost: "+cost);
			}
			else if(distance>300 && distance <500)
			{
				 cost = distance*9+1000;
//				System.out.println("cost: "+cost);
			}
			else {
				 cost = distance*10+1500;
//				System.out.println("cost: "+cost);
			}
		}
		public void displayBill(int amt)
		{
			amt = this.cost;
			System.out.println("START: "+startPoint);
			System.out.println("END: "+endPoint);
			System.out.println("Distance: "+distance);
			System.out.println("Bill: "+this.cost);
		}
}
