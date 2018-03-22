package ComparatorThings;

import java.util.ArrayList;

public class Fleet implements Printable {

  private ArrayList<Thing> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override                                   //automatically does this, I do not have to call this in the main
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }

  public void printAllFields(){
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    System.out.println(result);
  }
}
