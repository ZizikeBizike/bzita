import java.util.*;

public class Exercise11IsInList {

  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    checkNums(list);
    System.out.println(checkNums(list));

    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"
    //Az elementfinder és isinlist feladatokban hibát dob az ArrayList castolásánál, mikor ezekhez a feladatokhoz juttok használjátok őket castolás nélkül pl. így:
    //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));*/
  }

  public static boolean checkNums(List listToCheck) {
    ArrayList<Integer> numbersToCheck = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    if (listToCheck.containsAll(numbersToCheck)) {
      return true;
    } else {
      return false;
    }
  }
}
  /*public static Boolean checkNums (ArrayList<Integer> numbersToCheck) {
    if (numbersToCheck.contains(4) && numbersToCheck.contains(8) && numbersToCheck.contains(12) && numbersToCheck.contains(16)){
      return true;
    } else {
      return false;
    }
  }*/

