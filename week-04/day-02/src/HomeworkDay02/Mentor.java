package HomeworkDay02;

public class Mentor {
  String name;
  int age;
  String gender;
  String level;

  public void introduce(String name, int age, String gender, String level) {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Mentor (String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void main(String[] args) {
    Mentor mentor = new Mentor("Jane Doe", 30, "female", "intermediate");
  }
}
