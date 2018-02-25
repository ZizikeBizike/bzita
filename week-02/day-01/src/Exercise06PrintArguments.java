public class Exercise06PrintArguments {

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

    printer("first","second","third","fourth");
  }

  public static void printer(String... wordsToPrint){

    for (int i = 0; i < wordsToPrint.length; i++) {
      System.out.print(wordsToPrint[i] + ", ");
    }
  }
}
