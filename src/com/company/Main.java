package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Sword").print();
        System.out.println("----------------------------------\n");

        createObject("Spear").print();
        System.out.println("----------------------------------\n");

        createObject("Shield").print();
        System.out.println("----------------------------------\n");
        // Sword l0ng = new Sword(1.12, 500);
        // l0ng.print();
        Printable[] equip = {createObject("Sword"), createObject("Spear"), createObject("Shield")};
        for (Printable printable : equip) {
            printable.print();
        }
    }

    private static Printable createObject(String equip) {
        Printable printable = null;

        switch (equip) {
            case "Sword":
                printable = new Sword(1.01, 500);
                break;
            case "Spear":
                printable = new Spear(6.0, 200, 5);
                break;
            case "Shield":
                printable = new Shield(2.0, 150, 200);
                break;

        }
        return printable;
    }
}
