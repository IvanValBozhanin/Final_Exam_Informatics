package com.company;

import java.util.ArrayList;

public class Cashier extends Employee implements Cloneable{
    private int numberOfCheckout, years;
    private ArrayList<String> checkouts;

    public Cashier(int numberOfCheckout, int years, ArrayList<String> checkouts) {
        this.numberOfCheckout = numberOfCheckout;
        this.years = years;
        this.checkouts = checkouts;
    }

    public Cashier(String name, String mail, int numberOfCheckout, int years, ArrayList<String> checkouts) {
        super(name, mail);
        this.numberOfCheckout = numberOfCheckout;
        this.years = years;
        this.checkouts = checkouts;
    }

    @Override
    public int getScore() {
        return years*numberOfCheckout;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", numberOfCheckout=" + numberOfCheckout +
                ", years=" + years +
                ", checkouts=" + checkouts +
                '}';
    }

    @Override
    public Object clone() {
        try{
            Cashier c = (Cashier) super.clone();
            c.checkouts = (ArrayList<String>) checkouts.clone();
            return c;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getNumberOfCheckout() {
        return numberOfCheckout;
    }

    public void setNumberOfCheckout(int numberOfCheckout) {
        this.numberOfCheckout = numberOfCheckout;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public ArrayList<String> getCheckouts() {
        return checkouts;
    }

    public void setCheckouts(ArrayList<String> checkouts) {
        this.checkouts = checkouts;
    }
}
