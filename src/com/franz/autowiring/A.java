package com.franz.autowiring;

public class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public void display() {
        System.out.println("this is A");
        System.out.println("This is B: " + b.getName());
    }
}
