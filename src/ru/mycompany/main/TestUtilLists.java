package ru.mycompany.main;

import java.util.List;
import java.util.Random;

public class TestUtilLists {
    List<Employee> list;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int countOfElements;

    public TestUtilLists(List<Employee> list, int countOfElements) {
        this.list = list;
        this.countOfElements = countOfElements;
    }

    public long timeAddingIntoEmpty() {
        long startPoint = System.nanoTime();
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeInsertToMiddle() {
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        Employee mediator = new Employee("Mediator", 30);
        long startPoint = System.nanoTime();
        list.add(countOfElements / 2, mediator);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeInsertToBeggining() {
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        Employee beginner = new Employee("Beginner", 20);
        long startPoint = System.nanoTime();
        list.add(0, beginner);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromBegining() {
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        list.remove(0);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromEnd() {
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        list.remove(countOfElements - 1);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromMiddle() {
        for (int i = 0; i <= countOfElements; i++) {
            list.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        list.remove(countOfElements / 2);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }
}
