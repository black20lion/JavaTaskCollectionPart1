package ru.mycompany.main;
import java.util.Random;
import java.util.Set;

public class TestUtilSets {
    Set<Employee> set;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int countOfElements;

    public TestUtilSets(Set<Employee> set, int countOfElements) {
        this.set = set;
        this.countOfElements = countOfElements;
    }

    public long timeAdd() {
        long startPoint = System.nanoTime();
        for (int i = 0; i <= countOfElements; i++) {
            set.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }

    public long timeRemove() {
        for (int i = 0; i <= countOfElements/2; i++) {
            set.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        Employee test = new Employee("Test", 30);
        set.add(test);
        for (int i = countOfElements/2 + 1; i <= countOfElements; i++) {
            set.add(new Employee(Employee.generateName(new Random(), alphabet, 7),
                    new Random().nextInt(100 - 18) + 18));
        }
        long startPoint = System.nanoTime();
        set.remove(test);
        long endPoint = System.nanoTime();
        return (endPoint - startPoint);
    }
}
