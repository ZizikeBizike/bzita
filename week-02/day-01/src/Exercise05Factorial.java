public class Exercise05Factorial {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String[] args){

        int givenNumber = 10;
        factorio(givenNumber);
        System.out.println(factorio(givenNumber));
    }
    public static int factorio(int gN){
        int factorial = 1;
        for(int i = 1; i < gN + 1; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
