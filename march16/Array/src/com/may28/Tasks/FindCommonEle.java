package com.may28.Tasks;



public class FindCommonEle {
	public static int[] find(int arr1[],int arr2[])
    {
        int count=0;
        // temp=0
         for (int i=0; i<arr1.length; i++ )
        {
            for(int j=0;j<arr2.length; j++)
            {
                if(arr1[i]==arr2[j])
                {
                   count++; 
                } 
            }
        }
        
        int commonArr[]=new int[count];
        int temp=0;
        for (int i=0; i<arr1.length; i++ )
        {
            for(int j=0;j<arr2.length; j++)
            {
                if(arr1[i]==arr2[j])
                { 
                        commonArr[temp]=arr1[i];
                        temp++;
                }
            }
        }
        return commonArr;
    }
	public static void main(String[] args) {
	    int arr1[]={1,5,3,7,8,9};
        int arr2[]={2,6,1,3,9,6};

        int res[] = find(arr1,arr2);
        for(int r: res)
        {
        	
            System.out.print(r+",");
        }

	}
}
