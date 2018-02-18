import java.util.Scanner;

public class ExerciseNumber32b {

    public static void main(String[] args){

        //I got a tip from someone that at the diagonal i and j have equal values,
        // so I came up with a much more sophisticated solution
        // than the one I figured out by myself

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give an integer");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++) {
            System.out.print("%");
            for (int j = 1; j < userInput - 1; j++) {
                if (i == 0 || i == userInput - 1) {
                    System.out.print("%");
                } else if (i == j){
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("%");
            System.out.println();
        }

    }
}

