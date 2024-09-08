package com.may27.tasks;

import java.util.Scanner;

public class Search_ele {
	public static void search(int arr[],int ele)
	{
		
			int start = 0;
			int end = arr.length-1; //5
			int mid = (start+end)/2; // 2
			
			while(start<=end) {  //6<5
				if(arr[mid]==ele) 			//5==4
				{
					System.out.println("element Found");
					break;
				}
				else if(arr[mid]<ele)		//3<10
				{
					start = mid+1;//6
				}
				else if(arr[mid]>ele)		//5>4
				{
					end = mid-1;//3
				}
				mid = (start+end)/2;	//(5+5)/2 = 5
			}
			if(start>end)
			{
				System.out.println("Not found");
			}
		
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		for(int e : arr)
		{
			System.out.print(e+",");
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ele u want to search: ");
		int ele = sc.nextInt();
		search(arr, ele);
//		sc.close();
	}

}
