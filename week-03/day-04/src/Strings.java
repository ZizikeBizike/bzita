public class Strings {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.

  public static String replaceXtoY (String input) {

    char result;
    if (input.length() == 0){
      return "";
    } else if (input.charAt(0) == 'x') {
      result = 'y';
    } else {
      result = input.charAt(0);
    }
    return result + replaceXtoY(input.substring(1));
  }
  public static void main(String[] args) {
    System.out.println(replaceXtoY("asdfxsdfxgfhxyj"));
  }
}

/*if (input.length() == 0){
      return "";
    } else {
      char result = 'x' == input.charAt(0) ? 'y' : input.charAt(0);
      return result + replaceXtoY(input.substring(1));
    }*/

/*public static String replaceXtoY (String input){
    String inputWithY = "";
    for(int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'x') {
        inputWithY = input.replace(input.charAt(i), 'y');
      }
    }
    return inputWithY;
  }
 */