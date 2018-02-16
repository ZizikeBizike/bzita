import java.util.Scanner;

public class ExerciseNumber19 {

    public static void main(String[] args) {

        // 19 - OneTwoALot

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an integer.");
        int userInput = scanner.nextInt();

        if (userInput <= 0){
            System.out.println("Not enough");
        }
        if (userInput == 1){
            System.out.println("One");
        }
        if (userInput == 2){
            System.out.println("Two");
        }
        if (userInput > 2){
            System.out.println("A lot");
        }

    }
}
