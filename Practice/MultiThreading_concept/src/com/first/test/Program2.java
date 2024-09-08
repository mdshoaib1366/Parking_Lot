package com.first.test;

public class Program2 extends Thread {
	static String name = "ravi";

	public static void main(String args[]) {
		Program2 t = new Program2();
		t.Test(name);
		System.out.print(" " + name);
	}

	public void Test(String name) {
		start();
		System.out.print(" method");
	}

	public void run() {
		System.out.print(" run");
	}
}