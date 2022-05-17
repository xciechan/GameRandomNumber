package pl.java.github;

/**
 Created by xciechan
 on 2022-05-18

 The application is a simple game.
 The user has to guess the number drawn by the computer.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rangeNumbers = 100;
        System.out.println(getRandomNumber(rangeNumbers));

    }

    static int getRandomNumber (int rangeNumbers){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
