package com.company;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Employee implements Comparable<Employee>{
    protected String name, mail;

    protected Employee() {
    }

    protected Employee(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public abstract int getScore();

    public abstract String toString();

    public static <T extends Employee> ArrayList<T> getSortedByScore(ArrayList<T> l){
        ArrayList<T> list = (ArrayList<T>) l.clone();
        Collections.sort(list);
        return list;
    }

    public int compareTo(Employee o){
        return getScore() - o.getScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
