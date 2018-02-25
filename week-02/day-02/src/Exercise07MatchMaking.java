import java.util.*;

public class Exercise07MatchMaking{

  public static void main(String... args){

    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList <String> girls, ArrayList<String> boys){

    ArrayList<String> pairs = new ArrayList<String>();

    if (girls.size() <= boys.size()){
      for (int i = 0; i < girls.size(); i++) {
        pairs.add(girls.get(i));
        pairs.add(boys.get(i));
      }
    } else {
      for (int i = 0; i < boys.size(); i++){
        pairs.add(girls.get(i));
        pairs.add(boys.get(i));
      }
    }
    return pairs;
  }
}
