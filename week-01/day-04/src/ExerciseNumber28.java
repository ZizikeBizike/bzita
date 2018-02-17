import java.util.Scanner;

public class ExerciseNumber28 {

    public static void main(String[] args){

        // 28 - DrawTriangle

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an integer");
        int userInput = scanner.nextInt();

        for (int i = 1; i < userInput + 1; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
