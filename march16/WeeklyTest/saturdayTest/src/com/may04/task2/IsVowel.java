package com.may04.task2;

import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = sc.next().charAt(0);

		if(ch >= 'a' && ch <= 'z' || ch>='A' && ch<='Z' && ch>1)
		{
			if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("Vowel : "+ch);
			
			}
			else
			{
				System.out.println("Consonent: "+ch);
			}
		}
		else
		{
			System.err.println("not a alphabet or lengh is not equal to 1");
		}
		
//		System.out.println(ch);

	}
}
