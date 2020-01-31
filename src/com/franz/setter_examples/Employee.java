package com.franz.setter_examples;

public class Employee {
    private String name;
    private int id;
    private Department department;

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department.getDepartmentName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
