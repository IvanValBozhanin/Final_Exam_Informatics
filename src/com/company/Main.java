package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();
    public static Cashier c1 = new Cashier("A", "a@mail.com", 3, 4, new ArrayList<>(Arrays.asList("a", "b", "c")));
    public static Cashier c2 = new Cashier("B", "b@mail.com", 1, 7, new ArrayList<>(Arrays.asList("a")));
    public static Cashier c3 = new Cashier("C", "c@mail.com", 4, 5, new ArrayList<>(Arrays.asList("a","aa", "b", "c")));
    public static Cashier c4 = new Cashier("D", "d@mail.com", 3, 2, new ArrayList<>(Arrays.asList("a", "b", "c")));
    public static Manager m1 = new Manager("E", "e@mail.com", 5, 2, new ArrayList<>(Arrays.asList("a","aa", "Aa", "b", "c")));
    public static Manager m2 = new Manager("F", "f@mail.com", 3, 10, new ArrayList<>(Arrays.asList("a", "b", "c")));

    public static void main(String[] args) {

        addItemsToPriorityQueue();

        printItemsWithPQFunction();
//        System.out.println();

//        iterators return items from collection at random positions
//        also you need to comment out the previous function in order to work properly
//        printItemsWithIterator();
//        System.out.println();

//        testGenericMethodForSorting();
//        System.out.println();

//        testCloneFunction();
    }

    private static void testCloneFunction() {
        Cashier fake1 = (Cashier) c1.clone();
        fake1.setName("Cloned A");
        fake1.setCheckouts(new ArrayList<>(Arrays.asList("uu", "peter", "23")));
        fake1.setYears(1);
        fake1.setMail("AAAA@gmail.com");
        System.out.println(c1.toString());
        System.out.println(fake1.toString());

        System.out.println();

        Manager fake2 = (Manager) m1.clone();
        fake2.setName("Cloned E");
        fake2.setPeople(new ArrayList<>(Arrays.asList("OO", "PP", "aa", "ww", "qq")));
        fake2.setHours(100);
        fake2.setMail("EEEEE@gmail.com");
        System.out.println(m1.toString());
        System.out.println(fake2.toString());
    }

    private static void testGenericMethodForSorting() {
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, m1, m2));
        ArrayList<Employee> sorted = Employee.getSortedByScore(employees);
        for(Employee employee: employees){
            System.out.println(employee.toString());
        }
        System.out.println();
        for(Employee employee: sorted){
            System.out.println(employee.toString());
        }
    }

    private static void printItemsWithIterator() {
        Iterator<Employee> iterator = priorityQueue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void printItemsWithPQFunction() {
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().toString());
        }
    }

    private static void addItemsToPriorityQueue() {
        priorityQueue.add(c1);
        priorityQueue.add(c2);
        priorityQueue.add(c3);
        priorityQueue.add(c4);
        priorityQueue.add(m1);
        priorityQueue.add(m2);
    }

}
