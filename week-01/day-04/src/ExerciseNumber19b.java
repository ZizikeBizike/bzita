
import java.util.Scanner;

public class ExerciseNumber19b {

    public static void main(String[] args) {

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        float d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number.(If not integer, please use comma instead of period)");
        d = scanner.nextFloat();

        if (d <= 0) {
            System.out.println("Not enough");
        }
        if (d == 1) {
            System.out.println("One");
        }
        if (d == 2) {
            System.out.println("Two");
        }
        if (d > 0 && d < 1) {
            System.out.println("A very few");
        }
        if (d > 1 && d < 2) {
            System.out.println("A few");
        }
        if (d > 2) {
            System.out.println("A lot");
        }
    }
}
