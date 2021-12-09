package com.company;

import java.util.Random;

public class Sword extends Blacksmith {
    Random random = new Random();

    private static SwordType[] SWORD_TYPE = SwordType.values();
    private static int sType = SWORD_TYPE.length;

    private SwordType swordType() {
        return SWORD_TYPE[random.nextInt(sType)];
    }


    public Sword(double timeToMake, int cost) {
        super(timeToMake, cost);
    }

    @Override
    public void print() {
        System.out.println("Your " + swordType() + " is ready, you owe " + getCost() +
                "\nI've spent " + getTimeToMake());
    }
}
