package ru.mycompany.main;

import ru.mycompany.mylinkedlist.MyLinkedList;
import java.util.Random;

public class TestMyLinkList {
    MyLinkedList<Employee> myLinkedList;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int countOfElements;

    public TestMyLinkList(MyLinkedList<Employee> myLinkedList, int countOfElements) {
        this.myLinkedList = myLinkedList;
        this.countOfElements = countOfElements;
    }

    public long timeAddingIntoEmpty() {
        long startPoint = System.nanoTime();
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeInsertToMiddle() {
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        Employee mediator = new Employee("Mediator", 30);
        long startPoint = System.nanoTime();
        myLinkedList.add(countOfElements / 2, mediator);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeInsertToBeggining() {
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        Employee beginner = new Employee("Beginner", 20);
        long startPoint = System.nanoTime();
        myLinkedList.add(0, beginner);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromBegining() {
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        myLinkedList.remove(0);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromEnd() {
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        myLinkedList.remove(countOfElements - 1);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemoveFromMiddle() {
        for (int i = 0; i < countOfElements; i++) {
            myLinkedList.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        myLinkedList.remove(countOfElements / 2);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }
}
