import java.util.*;

public class Exercise10ElementFinder{

  public static void main(String... args){

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    System.out.println(containsSeven(list));

    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
    //Az elementfinder és isinlist feladatokban hibát dob az ArrayList castolásánál, mikor ezekhez a feladatokhoz juttok használjátok őket castolás nélkül pl. így:
    //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));*/
  }

  public static String containsSeven (List<Integer> list){

    if(list.contains(7)){
      return "Hoorray";
    } else {
      return "Noooooo";
      }
  }
}
