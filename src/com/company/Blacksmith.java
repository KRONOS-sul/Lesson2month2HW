package com.company;

public class Blacksmith implements Printable{     // 1 Уровень
    private double timeToMake;
    private int cost;

    public Blacksmith(double timeToMake, int cost) {
        this.timeToMake = timeToMake;
        this.cost = cost;
    }

    public double getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(double timeToMake) {
        this.timeToMake = timeToMake;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void print() {
        System.out.println("The order is ready!");
    }
}
