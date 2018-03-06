package GreenFoxOrganization;

public class Mentor extends Person {
  public String level;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public Mentor() {
    super();
    level = "intermediate";
  }
}
