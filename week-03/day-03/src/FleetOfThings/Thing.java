package FleetOfThings;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
  private String name;
  private boolean completed;

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
}
