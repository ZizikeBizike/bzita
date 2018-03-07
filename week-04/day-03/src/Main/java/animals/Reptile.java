package Main.java.animals;

public class Reptile extends Animal {

  private int bloodTemperature;

  public String getName() {
    return name;
  }

  public String breed() {
    return "laying eggs";
  }

  public void eat() {}

  public void drink() {}

  public void sleep() {}

  public void sunBathe() {
    bloodTemperature++;
  }

  public Reptile(String name) {
    this.name = name;
  }
}
