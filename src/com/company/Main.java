package com.company;

import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	int secrectNum = rand.nextInt(10) + 1;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("i have chosen a number between 1 and 10. Try to guess it.");

        int guess;

        do {
            System.out.println("Your guess: ");

            guess = keyboard.nextInt();
            if (guess == secrectNum) {
                System.out.println("That's right!  You're a good guesser");
                break;
            } else {
                System.out.println("That is incorrect. Guess again.");
            }
        }while (guess != secrectNum);
    }
}
