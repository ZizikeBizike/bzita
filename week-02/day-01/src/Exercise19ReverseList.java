public class Exercise19ReverseList {

  // - Create an array variable named `aj`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `aj`
  // - Print the elements of the reversed `aj`

  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};
    int[] reversedAj = new int[5];

    for (int i = 0; i < aj.length; i++) {
      reversedAj[i] = aj[aj.length - 1 - i];
    }

    aj = reversedAj;

    for (int i = 0; i < aj.length; i++) {
      System.out.print(aj[i] + ", ");
    }
  }
}
