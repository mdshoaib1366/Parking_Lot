package com.findMaxandMin;

public class Missing_ELE {

	public static void main(String[] args) {
		int arr[]= {3,5,6,9};

		for (int i = 0; i < arr.length-1; i++) // 2
		{
			for(int j=arr[i]; j<arr[i+1]; j++) // 8<9
			{
				if(arr[i]!=j) //8!=6
				System.out.println("Missing element : "+j);
			}
		}
	}

}
