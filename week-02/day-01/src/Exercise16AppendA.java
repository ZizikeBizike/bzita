public class Exercise16AppendA {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

   public static void main(String[] args){

        printer("first", "second", "third", "fourth");
    }

    public static void printer(String... words){
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ", ");
        }
    }

    /*public static void main(String[] args){

        printer("first","second","third","fourth");
    }

    public static void printer(String... s){
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
        }

    }*/

}
