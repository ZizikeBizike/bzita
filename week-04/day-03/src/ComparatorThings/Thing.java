package ComparatorThings;

public class Thing <Thing> {

  private String name;
  private boolean completed;

  //public int compareTo (Thing th){
 //   if
  //}

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override                             //automatically does this, I do not have to call this in the main
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  public void printAllFields(){
    System.out.println((completed ? "[x] " : "[ ] ") + name);
  }
}
