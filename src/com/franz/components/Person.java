package com.franz.components;

public class Person {
    private String firstName;
    private String lastName;
    private Pet pet;
    private ToDo todo;

    public Person(String firstName, String lastName, Pet pet, ToDo todo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.todo = todo;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public void printName() {
        System.out.println(firstName + lastName);
    }

    public void printPetName() {
        pet.printName();
    }

    public void printMyTodo() {
        todo.printTodo();
    }

    public String getFirstName() {
        return firstName;
    }
}
