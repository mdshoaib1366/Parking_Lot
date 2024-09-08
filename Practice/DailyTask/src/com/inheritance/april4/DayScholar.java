package com.inheritance.april4;

public class DayScholar extends Student{
		protected double transportFee;

		public DayScholar(int studentId, String studentName, double examFee, double transportFee) {
			super(studentId, studentName, examFee);
			this.transportFee = transportFee;
		}

		public void payFee(double amount)
		{
			if(amount < 1)
			{
				System.out.println("All fees are clear.");
			}
			else 
			{
				amount = amount-(transportFee + super.examFee);
				System.out.println("Excess amount: "+(-amount));
			}
		}
		
		
		@Override
		public String toString() {
			return super.toString()+"DayScholar [transportFee=" + transportFee + "]";
		}
		
}
