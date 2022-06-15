package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;
import java.util.Random;

public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here!
        int location = Arrays.asList(hidingSpots).indexOf("Nut");
        System.out.println("Found it! It's in spot# " + location);
    }
}
