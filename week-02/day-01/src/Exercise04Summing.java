public class Exercise04Summing {

  //  Create the usual class wrapper
  //  and main method on your own.
  // - Write a function called `sum` that sum all the numbers
  //   until the given parameter and returns with an integer

  public static void main(String[] args) {
    int numberToSumUntil = 10;
    System.out.println(sum(numberToSumUntil));
  }
  public static int sum (int givenNumber) {
    int sumOfNumbers = 0;
    for (int i = 1; i <= givenNumber; i++) {
      sumOfNumbers += i;
    }
    return sumOfNumbers;
  }
}

