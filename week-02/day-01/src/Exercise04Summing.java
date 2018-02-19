public class Exercise04Summing {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    public static void main(String[] args){
        int givenNumber = 10;
        System.out.println(summing(givenNumber));
    }
    public static int summing(int gN){
        int sum = 0;
        for (int i = 1; i < gN + 1; i++){
            sum = sum + i;
        }
        return sum;
    }
}
