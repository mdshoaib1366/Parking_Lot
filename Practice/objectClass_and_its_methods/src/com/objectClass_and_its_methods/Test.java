package com.objectClass_and_its_methods;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12,"A");
		Student s2 = new Student(12,"A");

		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());

		System.out.println(s1==s2);
		
//		System.out.println(s1.hashCode()==s2.hashCode());
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));

		System.out.println(s1.equals(s2));
		
		System.out.println(s1.getClass());

	}

}
