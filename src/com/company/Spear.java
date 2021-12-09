package com.company;

public class Spear extends Blacksmith {
    private int length;
    private String name = "spear";

    public Spear(double timeToMake, int cost, int length) {
        super(timeToMake, cost);
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Kill'em all with your new " + name + ", you owe " + getCost()
                + " " + "\nI've spent " + getTimeToMake());
    }
}
