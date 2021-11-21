package ru.mycompany.main;

import ru.mycompany.mylinkedlist.MyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Maria");
        Employee e3 = new Employee("Ashot");

        LinkedList<Employee> linkedList1 = new LinkedList<>();

        linkedList1.add(e1);
        linkedList1.add(e2);
        linkedList1.add(e3);

        System.out.println(linkedList1);

        MyLinkedList<Employee> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add(e1);
        myLinkedList1.add(e2);
        myLinkedList1.add(e3);

        Employee e4 = new Employee("Bart");

        myLinkedList1.add(1, e4);
        myLinkedList1.add(0, e3);

        System.out.println(myLinkedList1.get(0));
        System.out.println(myLinkedList1.get(1));
        System.out.println(myLinkedList1.get(2));
        System.out.println(myLinkedList1.get(3));
        System.out.println(myLinkedList1.get(4));

        myLinkedList1.clear();

    }
}
