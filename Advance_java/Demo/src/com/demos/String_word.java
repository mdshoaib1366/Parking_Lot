package com.demos;

import java.util.Arrays;

public class String_word {
	 public static void main(String[] args)
	 {
		   String s1 = "He is my Friend";
		   String st="A";
		   String st2="A";
		   System.out.println(st.compareTo(st2));
		   String[] split = s1.split(" ");
		   System.out.println(split.length);
		   
//		   for(int i=0; i<split.length; i++) {
//			   System.out.println(split[i].length());
//		   }
		   
		   int word=1;
//		   for(int i=0;  i<s1.length(); i++)
//		   {  
//			   
//			   if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
//			   {
//				  
//				  
//			   }
//			}
		   
		   
		   System.out.println("\nWOrd Count: "+word);
	 }
}
