package com.may29.Tasks;


public class SumOf2Ele {
	public static void sum(int arr[],int t)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==t)
				{
					System.out.println("Ele: "+arr[i]+" ,Ele: "+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6};
		int target = 6;
		sum(arr,target);
	}
}


