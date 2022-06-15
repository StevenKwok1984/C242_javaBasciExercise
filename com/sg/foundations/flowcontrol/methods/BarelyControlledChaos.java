package com.sg.foundations.flowcontrol.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = colour(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = colour(); // call color method again here
        int weight = number(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = number(10, 20); // call number method,
        // with a range between 10 - 20
        int number = number(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = number(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    //  Method 1
    public static String colour() {
        // creating colour list
        List<String> colorList = Arrays.asList("magenta", "periwinkle", "red", "green", "blue", "orange", "black", "white");

        // select random color
        Random rand = new Random();
        String randomColour = colorList.get(rand.nextInt(colorList.size()));
        // return colour
        return randomColour;
    }

    //  Method 2
    public static String animal() {
        // creating colour list
        List<String> animalList = Arrays.asList("mammoth", "dragon", "lion", "panda", "tiger", "Akita");

        // select random animal
        Random rand = new Random();
        String randomAnimal = animalList.get(rand.nextInt(animalList.size()));
        // return animal
        return randomAnimal;
    }

    //  Method 3
    public static int number(int min, int max) {

        // make randomizer
        Random rand = new Random();
        // generate random number
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }



}
