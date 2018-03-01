public class Counter {
  // Write a recursive function that takes one parameter: n and counts down from n.

  public static int counter (int n){
    System.out.println(n);
    if (n == 0) {
      return 0;
    } else {
      return counter(n - 1);
    }
  }
  public static void main(String[] args){
    counter(15);
  }
}
