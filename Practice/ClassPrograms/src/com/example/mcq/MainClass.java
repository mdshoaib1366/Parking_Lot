package com.example.mcq;

class First
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        First first = null;

        first.staticMethod();
    }
}
