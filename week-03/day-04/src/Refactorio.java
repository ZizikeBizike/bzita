public class Refactorio {
  // Create a recursive function called `refactorio`
  // that returns it's input's factorial

  public static int refactorio (int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * refactorio (n - 1);
    }
  }
  public static void main(String[] args) {
    System.out.println(refactorio(5));
  }
}
