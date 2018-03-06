package HomeworkDay02;

public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;

  public void introduce(String name, int age, String gender, String company, String hiredStudents) {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire(){
    hiredStudents++;
  }

  public Sponsor (String name, int age, String gender, String company, int hiredStudents) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;
  }

  public void main(String[] args) {
    Sponsor sponsor = new Sponsor("Jane Doe", 30, "female", "Google", 0);
  }
}
