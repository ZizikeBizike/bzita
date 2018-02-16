
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 14 - HelloUser

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Please type your name in the next line and press Enter");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1 + "!");


        // 15 - MileToKmConverter

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Please give an integer. It will be a distance in kilometers. I will convert it to miles.");
        int userInput2 = scanner.nextInt();
        System.out.println(userInput2 + " kilometers is " + userInput2 * 0.621371192 + " miles.");
    }
}
