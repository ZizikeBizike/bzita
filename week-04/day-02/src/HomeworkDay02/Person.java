package HomeworkDay02;

public class Person {
  String name;
  int age;
  String gender;

  public void introduce(String name, int age, String gender) {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public Person (String name, int age, String gender ) {
    this.name = "Jane Doe"; //a super()-rel ezt hívom meg a másik osztályba vagy supe(name, age, gender)
    this.age = 30;
    this.gender = "female";
  }

  public static void main(String[] args) {
    Person person = new Person("Jane Doe", 30, "female");
  }
}
