package Main.java.animals;

public class Bird extends Animal {

  private String featherColor;

  public String getName() {
    return name;
  }

  public String breed() {
    return "laying eggs";
  }

  public void eat() {}

  public void drink() {}

  public void sleep() {}

  private void fly(){}

  public Bird (String name) {
    this.name = "Bird";
  }
}
