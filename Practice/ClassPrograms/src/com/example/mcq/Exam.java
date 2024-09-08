package com.example.mcq;

class Parent {
    String name = "parent";
    String message() {
        return "from parent";
    }
}

class Child extends Parent {
    String name = "child";
    String message() {
        return "from child";
    }
}

public class Exam {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name + " " + p.message());
    }
}
