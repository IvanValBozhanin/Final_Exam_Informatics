package com.company;

import java.util.ArrayList;

public class Manager extends Employee implements Cloneable{
    private int numberOfPeople, hours;
    private ArrayList<String> people;

    public Manager(int numberOfPeople, int hours, ArrayList<String> people) {
        this.numberOfPeople = numberOfPeople;
        this.hours = hours;
        this.people = people;
    }

    public Manager(String name, String mail, int numberOfPeople, int hours, ArrayList<String> people) {
        super(name, mail);
        this.numberOfPeople = numberOfPeople;
        this.hours = hours;
        this.people = people;
    }

    @Override
    public int getScore() {
        return hours*numberOfPeople;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", hours=" + hours +
                ", people=" + people.toString() +
                '}';
    }

    @Override
    public Object clone() {
        try{
            Manager m = (Manager) super.clone();
            m.people = (ArrayList<String>) people.clone();
            return m;
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ArrayList<String> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<String> people) {
        this.people = people;
    }
}
