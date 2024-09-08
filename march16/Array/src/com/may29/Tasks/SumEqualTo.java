package com.may29.Tasks;

public class SumEqualTo {

	public static void sum(int arr[],int target)
	{
		System.out.println("you have only this ele only");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==target)
					{
						System.out.println("ele1:"+arr[i]+" ele2:"+arr[j]+" ele3:"+arr[k]);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, -2, 0, 5, -1, -4};
		int target = 2;
		sum(arr, target);

	}

}
