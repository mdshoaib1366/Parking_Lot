package com.trigular_matrix;

import java.util.Scanner;

public class Upper_triangular_matrix {
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
		

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i<j)
				{
					arr[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
			
		
	}
}
