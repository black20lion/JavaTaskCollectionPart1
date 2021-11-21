package ru.mycompany.main;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
