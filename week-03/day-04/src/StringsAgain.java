public class StringsAgain {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.
  public static void main(String[] args) {

    System.out.println(removeX("srxiXyxhiexikeXilexx"));
  }
  public static String removeX(String input) {
    char result;
    if (input.length() == 0) {
      return "";
    } else if (input.charAt(0) == 'x') {
        result = 0;
    } else {
      result = input.charAt(0);
    }
    return result + removeX(input.substring(1));
  }
}
