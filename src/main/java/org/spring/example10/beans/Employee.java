package org.spring.example10.beans;

public class Employee {
    private static final Employee INSTANCE = new Employee();

    private Employee() {

    }

    public static Employee getInstance() {
        return INSTANCE;
    }
}