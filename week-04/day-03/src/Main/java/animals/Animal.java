package Main.java.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected int gender;

  abstract String getName();

  abstract String breed();

  abstract void eat();

  abstract void drink();

  abstract void sleep();

  public Animal(String name) {
    this.name = name;
  }

  public Animal() {}
}
