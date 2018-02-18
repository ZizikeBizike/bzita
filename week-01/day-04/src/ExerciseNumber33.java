import java.util.Scanner;

public class ExerciseNumber33 {
    public static void main(String[] args) {

        // 33 - GuessTheNumber

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);
        int userInput;
        int numberToGuess = 8;
        System.out.println("I thought of an integer between 0 and 100.");
        do {
            System.out.println("Guess the number!");
            userInput = scanner.nextInt();
            if (userInput == numberToGuess) {
                System.out.println("You found the number: 8");
            } else if (userInput < 0 || userInput > 100) {
                System.out.println("The number is between 0 and 100.");
            } else if (userInput < numberToGuess && userInput >= 0) {
                System.out.println("The stored number is higher.");
            } else if (userInput > numberToGuess && userInput <= 100) {
                System.out.println("The stored number is lower.");
            }
        } while (userInput != numberToGuess);
    }
}
