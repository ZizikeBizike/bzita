import java.util.Scanner;

public class ExerciseNumber21{

    public static void main(String[] args){

        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner scanner = new Scanner (System.in);
        System.out.println("There is going to be a party! Please give the number of girls coming!");
        int userInput1 = scanner.nextInt();
        System.out.println("Please give the number of boys coming!");
        int userInput2 = scanner.nextInt();

        if ((userInput1 == userInput2) && (userInput1 + userInput2 > 20)) {
            System.out.println("The party is excellent!");
        }
        if ((userInput1 != userInput2) && (userInput1 + userInput2 > 20) && (userInput1 != 0)){
            System.out.println("Quite cool party!");
        }
        if (userInput1 + userInput2 < 20){
            System.out.println("Average party...");
        }
        if (userInput1 == 0){
            System.out.println("Sausage party");
        }

    }
}
