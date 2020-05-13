package com.cresuta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// User allowed 3 guesses before game ends
        System.out.println("Welcome to the guessing game!");
        System.out.println("Please enter a number between 1 and 10:");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int numberOfGuesses = 1;
        int secretNumber = 7;

        while (numberOfGuesses < 3){
            if(guess == secretNumber){
                System.out.println("Congratulations, you won!");
                break;
            } else if(guess == 0){
                numberOfGuesses --;
                System.out.println("Sorry, please guess a number between 1 and 10.");
                guess = input.nextInt();
            } else if(guess == -1){
                System.out.println("We're sorry to see you go. Thanks for playing!");
                break;
            } else if(guess > secretNumber) {
                System.out.println("Your guess is too high! Try again:");
                guess = input.nextInt();
            } else if(guess < secretNumber) {
                System.out.println("Your guess is too low! Try again:");
                guess = input.nextInt();
            }
            numberOfGuesses ++;
        }
        System.out.println("Game Over. It took you " + numberOfGuesses + " try(s).");
    }
}
