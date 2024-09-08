package com.day8;

class TwoDigitsSum{
	static int getSumOfDigits(int n) {
		int sum =0;
		if(n<0) return -3;
		else if(n>=0 && n<9) return -1;
		else if(n>99) return -2;
		else {
			int rem = n%10;
			int res = n/10;
			sum = rem + res;
		}
		return sum;
	}
}
public class SumOfDigits {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = TwoDigitsSum.getSumOfDigits(num);
		
		System.out.println("Sum Of Two Digits: "+temp);
	}

}
