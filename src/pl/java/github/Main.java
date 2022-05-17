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
        System.out.println(processOfGuessingTheNumber(getRandomNumber(rangeNumbers)));

    }

    static int getRandomNumber (int rangeNumbers){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    static String processOfGuessingTheNumber(int randomNumber){
        Scanner scanner = new Scanner(System.in);
        int numberEnter = 0;
        int numberOfTries = 0;

        do {
            numberEnter = scanner.nextInt();
            numberOfTries += 1;

        }
        while (numberEnter != randomNumber);

        return "You guess";
    }

}
