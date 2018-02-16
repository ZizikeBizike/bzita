import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args){

        // 18 - OddEven

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please give an integer, then press Enter. I will tell if it is odd or even.");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0){
            System.out.println("Even.");
        }
        if (userInput % 2 == 1){
            System.out.println("Odd.");
        }

    }
}
