public class StringsAgainAndAgain {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".

  public static void main(String[] args) {
    System.out.println(giveExtraStar("sdflkezosn"));
  }
  public static String giveExtraStar (String input) {
    String result;
    if (input.length() == 0) {
      return "";
    } else if (input.length() == 1) {
      result = input.charAt(0) + "";
    } else {
      result = input.charAt(0) + "*" + giveExtraStar(input.substring(1));
    }
    return result;
  }
}
