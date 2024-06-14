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
        
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        
   
        boolean hasWon = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

       
        while (!hasWon) {
            System.out.print("Enter your guess: ");
            
          int guess = scanner.nextInt();
           attempts++;
          
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
