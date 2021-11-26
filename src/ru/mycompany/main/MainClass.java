package ru.mycompany.main;

import ru.mycompany.mylinkedlist.MyLinkedList;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Maria");
        Employee e3 = new Employee("Ashot");
        Employee e4 = new Employee("Bart");
        Employee e5 = new Employee("Boris");

        System.out.println("==============================");

        MyLinkedList<Employee> myLinkedList1 = new MyLinkedList<>();

        myLinkedList1.add(e1);
        myLinkedList1.add(e2);
        myLinkedList1.add(e3);

        for (Employee employee : myLinkedList1) {
            System.out.println(employee);
        }

        System.out.println(myLinkedList1);

        System.out.println("==============================");

        myLinkedList1.add(0, e4);
        myLinkedList1.add(3, e5);
        System.out.println("Bart and Boris were added");
        System.out.println("==============================");

        for (Employee employee : myLinkedList1) {
            System.out.println(employee);
        }

        System.out.println(myLinkedList1);

        System.out.println("==============================");

        for (Object o : myLinkedList1.toArray()) {
            System.out.println(o);
        }

        System.out.println("==============================");

        Employee[] eArray = new Employee[3];
        for (Employee e : myLinkedList1.<Employee>toArray(eArray)) {
            System.out.println(e.getName());
        }

        System.out.println("==============================");

        System.out.println("Index of " + e1.getName() + " is " + myLinkedList1.indexOf(e1));
        System.out.println("Index of " + e3.getName() + " is " + myLinkedList1.indexOf(e3));
        System.out.println("Index of " + e5.getName() + " is " + myLinkedList1.indexOf(e5));

        System.out.println("==============================");

        Employee e6 = new Employee("Anna");
        System.out.println(myLinkedList1.set(2, e6).getName() + " is reset");
        System.out.println(myLinkedList1.get(2) + " is here now");
        System.out.println(myLinkedList1);

        System.out.println("==============================");

        System.out.println(myLinkedList1.remove(4) + " is removed");
        System.out.println(myLinkedList1.remove(0) + " is removed");
        System.out.println(myLinkedList1.remove(2) + " is removed");
        System.out.println(myLinkedList1);
        System.out.println("Size is " + myLinkedList1.size() + " now");

        System.out.println("==============================");

        myLinkedList1.clear();
        System.out.println("List was cleared");
        System.out.println("Size is " + myLinkedList1.size() + " now");

        System.out.println("==============================");

//        LinkedList<Employee> linkedList = new LinkedList<>();
//        TestUtilLists linkListTest = new TestUtilLists(linkedList, 1000000); *For different number of Elements*
//        System.out.println(linkListTest.timeRemoveFromMiddle()); *And other operations*

//        ArrayList<Employee> arrayList = new ArrayList<>();
//        TestUtilLists arrayListTest = new TestUtilLists(arrayList, 1000000); *For different number of Elements*
//        System.out.println(arrayListTest.timeRemoveFromMiddle()); *And other operations*

//        MyLinkedList<Employee> myLinkedList = new MyLinkedList<>();
//        TestMyLinkList myLinkListTest = new TestMyLinkList(myLinkedList, 1000000); *For different number of Elements*
//        System.out.println(myLinkListTest.timeRemoveFromMiddle()); *And other operations*

//        HashSet<Employee> hashSet = new HashSet<>();
//        TestUtilSets hashSetTest = new TestUtilSets(hashSet, 1000000); *For different number of Elements*
//        System.out.println(hashSetTest.timeRemove()); *And other operations*

//        LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();
//        TestUtilSets linkedHashSetTest = new TestUtilSets(linkedHashSet, 1000000); *For different number of Elements*
//        System.out.println(linkHashSetTest.timeRemove()); *And other operations*

//        TreeSet<Employee> treeSet = new TreeSet<>();
//        TestUtilSets treeSetTest = new TestUtilSets(treeSet, 1000000); *For different number of Elements*
//        System.out.println(treeSetTest.timeRemove()); *And other operations*

//        HashMap<Employee, Integer> hashMap = new HashMap<>();
//        TestUtilMaps testHashMap = new TestUtilMaps(hashMap, 1000000); *For different number of Elements*
//        System.out.println(testHashMap.timeRemove()); *And other operations*

//        LinkedHashMap<Employee, Integer> linkedHashMap = new LinkedHashMap<>();
//        TestUtilMaps testLinkedHashMap = new TestUtilMaps(linkedHashMap, 1000000); *For different number of Elements*
//        System.out.println(testLinkedHashMap.timeRemove()); *And other operations*

        TreeMap<Employee, Integer> treeMap = new TreeMap<>();
        TestUtilMaps testTreeMap = new TestUtilMaps(treeMap, 1000000);
        System.out.println(testTreeMap.timeRemove());


    }
}
