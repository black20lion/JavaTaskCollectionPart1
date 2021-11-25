package ru.mycompany.main;

import java.util.Random;

public class Employee {
    String name;
    int age;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public static String generateName(Random rng, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
