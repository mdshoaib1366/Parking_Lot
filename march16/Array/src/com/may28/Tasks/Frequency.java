package com.may28.Tasks;


public class Frequency {

	public static void frequency(int arr[])
	{
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			int ele = arr[i];
			if(arr[i]==-1)
			{
				continue;
			}
			for (int j = i; j < arr.length; j++) {
				if(ele==arr[j])
				{
					arr[j]=-1;
					count++;
				}
			}
//			System.out.println(Arrays.toString(arr));
			if(count>=1)
				System.out.println("The frequency of the element "+ele+" is "+count+" time(s) ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,5,3,1,2,5,6,1};
		frequency(arr);
	}

}
