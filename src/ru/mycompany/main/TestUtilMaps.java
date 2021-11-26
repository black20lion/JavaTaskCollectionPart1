package ru.mycompany.main;

import java.util.Map;
import java.util.Random;

public class TestUtilMaps {
    Map<Employee, Integer> map;
    int countOfElements;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public TestUtilMaps(Map<Employee, Integer> map, int countOfElements) {
        this.map = map;
        this.countOfElements = countOfElements;
    }

    public long timeAdd() {
        long startPoint = System.nanoTime();
        for (int i = 0; i <= countOfElements; i++) {
            int age = new Random().nextInt((100 - 18) + 18);
            map.put(new Employee(Employee.generateName(new Random(), alphabet, 7), age), age);
        }
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemove() {
        for (int i = 0; i <= countOfElements/2; i++) {
            int age = new Random().nextInt((100 - 18) + 18);
            map.put(new Employee(Employee.generateName(new Random(), alphabet, 7), age), age);
        }
        Employee test = new Employee("Test", 30);
        map.put(test , 30);
        for (int i = countOfElements/2 + 1; i <= countOfElements; i++) {
            int age = new Random().nextInt((100 - 18) + 18);
            map.put(new Employee(Employee.generateName(new Random(), alphabet, 7), age), age);
        }
        long startPoint = System.nanoTime();
        map.remove(test);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }
}
