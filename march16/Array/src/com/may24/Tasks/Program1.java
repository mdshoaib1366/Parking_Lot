package com.may24.Tasks;

public class Program1 {
	public static void arithematicOperation(int arr[])
	{
//		int newArr[]=new int[arr.length];
		int sum=arr[0];
		int sub = arr[0];
		int pro = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i];
			sub-=arr[i];
			pro*=arr[i];
		}
		System.out.println(" Sum: "+sum+"\n Sub: "+sub+"\n product: "+pro);
	}
	public static void print(int arr[])
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		arithematicOperation(arr);
		print(arr);
	}
}
