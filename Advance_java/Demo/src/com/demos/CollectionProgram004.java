package com.demos;

import java.util.*;


public class CollectionProgram004 {
public static void main(String[] args) {
	Vector<Object> v1=new Vector<Object>();
	v1.add(10);
	v1.add("hello");
	v1.add('a');
	v1.add(true);
	v1.add("hello");
        // logic for removing 
	v1.remove('a');
	System.out.print("Capacity :"+v1.capacity()+" ");
	System.out.print("size :"+v1.size()+" ");
	System.out.print("Element :"+v1);
	
}
}