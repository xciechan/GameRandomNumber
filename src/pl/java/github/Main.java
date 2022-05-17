package pl.java.github;

/**
 Created by xciechan
 on 2022-05-18

 The application is a simple game.
 The user has to guess the number drawn by the computer.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rangeNumbers = 100;
        processOfGuessingTheNumber(getRandomNumber(rangeNumbers));

    }

    static int getRandomNumber (int rangeNumbers){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    static void processOfGuessingTheNumber(int randomNumber){
        Scanner scanner = new Scanner(System.in);
        int numberEnter = 0;
        int numberOfTries = 0;

        System.out.println("Guess the number drawn by the computer");

        do {
            numberEnter = scanner.nextInt();
            numberOfTries += 1;

            if (numberEnter > randomNumber){
                System.out.println("The number entered is too big");
            } else if (numberEnter < randomNumber){
                System.out.println("The number entered is too small");
            } else {
                System.out.println();
                System.out.println("Congratulations - you guess!");
                System.out.println("The random number is: " + randomNumber + ", Number of Tries: " + numberOfTries);
            }

        }
        while (numberEnter != randomNumber);

    }

}
