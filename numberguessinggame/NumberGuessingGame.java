/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

/**
 *
 * @author nkuna
 */ 
import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object for generating random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        
        // Initialize the number of attempts
        int attempts = 0;
        
        // Initialize a flag to indicate if the game is won
        boolean hasWon = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop
        while (!hasWon) {
            System.out.print("Enter your guess: ");
            
            // Read the user's guess
            int guess = scanner.nextInt();
            
            // Increment the number of attempts
            attempts++;
            
            // Check if the guess is correct
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
