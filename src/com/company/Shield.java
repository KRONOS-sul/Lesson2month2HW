package com.company;

public class Shield extends Blacksmith {
    private int viability;

    public Shield(double timeToMake, int cost, int viability) {
        super(timeToMake, cost);
        this.viability = viability;
    }

    @Override
    public void print() {
        System.out.println("Be careful, it is pretty tough (" + viability + ")"
                + "you owe " + getCost() + "\nI've spent " + getTimeToMake());
    }
}
