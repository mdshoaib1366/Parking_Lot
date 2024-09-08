package com.matrix1;

import java.util.Scanner;

public class Sum_of_rightDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row: ");
		int row = sc.nextInt();
		System.out.println("enter col: ");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("enter ele ["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		int sum =0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
			if(i==j)
				{
					sum = sum + arr[i][j];
					
				}
			
			}
		}
		System.out.println(sum);
		
	}
}
