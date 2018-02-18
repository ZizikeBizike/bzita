import java.util.Scanner;

public class ExerciseNumber32 {
    public static void main(String[] args){

        // 32 - DrawDiagonal

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++){
            System.out.print("%");
            for (int j = 0; j < userInput - 2; j++) {
                if (i == 0 || i == userInput - 1) {
                    System.out.print("%");
                } else {
                    for (int k = 1; k < userInput - 1; k++) {
                        if (k == i && j == 0) {
                            System.out.print("%");
                        } else if (k != i && j == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("");
                        }
                    }
                }
            }
            System.out.print("%");
            System.out.println();
        }
    }
}
