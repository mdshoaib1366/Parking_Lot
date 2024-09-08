package com.shoaib.test;

public class ProfitAndLoss {
		public static void main(String[] args) {
			double cp = Double.parseDouble(args[0]);
			double sp = Double.parseDouble(args[1]);
			if(cp>sp) 
			{
				double loss = cp-sp;
				System.out.println("LOSS: "+ loss);
				double lPercentage = loss/cp*100;
				System.out.println("\nloss Percentage: "+lPercentage+"%");
			}
			else
			{
				double profit = sp-cp;
				System.out.println("PROFIT: "+profit);
				double pPercentage = profit/cp*100;
				System.out.println("\nloss Percentage: "+pPercentage+"%");
			}
		}
}
