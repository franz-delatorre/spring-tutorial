package com.franz.components;

public class Pet {
    private String name;

    public Pet(String n) {
        name = n;
    }

    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
