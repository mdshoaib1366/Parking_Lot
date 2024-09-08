package com.example.mcq;

class Alpha
{
    public void m1()
    {
        System.out.println("Hi");
    }
}
class Beta extends Alpha
{
     public void m1()
    {
        System.out.println("Hi2");
    }
}
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        // Beta b = new Beta();
        Alpha a = new Alpha();
        a.m1();
	}
}