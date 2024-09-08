package com.may17;

import java.util.Arrays;
/*
 * 4	2	7	5	1
 * 1	2	7	5	4
 * 1	2	4	5	7
 * time = 345900
 * 
 */
public class SortArray {
	public static void main(String[] args) {
		int arr[]= {14,6,7,'a',11};
		long s=System.nanoTime();
		System.out.println(Arrays.toString(arr));
		int flag=0;
		for (int i = 0; i < arr.length; i++) {	//i=3
			int min=i;
			for (int j = i+1; j < arr.length; j++) { //j=4
				if(arr[min]>arr[j])//  (arr[3]>arr[4])
				{					//	5>
					min=j;//4
					flag =1;
				}	
			}
			if(flag==1) {
			int temp = arr[i];  //temp = arr[2]------------>7
			arr[i]=arr[min];	//arr[2] = arr[4]---------->4
			arr[min]=temp;		//arr[4] = temp------------>7
			}
		}
		long e=System.nanoTime();
		long time = e-s;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(time);
	}
}


