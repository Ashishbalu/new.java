import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; //Generates a number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println("welcome to the number Guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have to guess the number in as few attempts as possible");
        System.out.println("After each guess, I'll tell you if your guess is higher or lower");
        System.out.println("Ready to start?");
        System.out.println("Enter your first guess:");
        
        while (guess != randomNumber) {
            guess = scanner.nextInt();
        attempts++;
            if (guess < randomNumber) {
                System.out.println("Your guess is too low");
            }
            else if (guess > randomNumber) {
                System.out.println("Your guess is too high");
            }
        }
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");

        scanner.close();
    }
}