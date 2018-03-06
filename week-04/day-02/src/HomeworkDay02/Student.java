package HomeworkDay02;

public class Student {    //public class Student extends Person
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;
  int numberOfDays;

  public void introduce(String name, int age, String gender, String previousOrganization) { // @override fölé írva
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = "Jane Doe";   //super(); ezzel hivatkozom a Person classra (parent class), és akkor nem kell az ott lévő változókat is megírni, ilyenkor public Student () üresen hagyva a zárójel
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void main(String[] args) {
    Student student = new Student("Jane Doe", 30, "female", "The School of Life");
    skippedDays = 0;  //student.skippedDays -ilyet nem csinálunk, helyette egy public methodot csinálok: public void setSkippedDays(int days){skippedDays = days; + extrákat, pl: sendEmail();}
  }                     //ezek a getterek és a setterek setter-beállítja, getter kinyeri az adatokat
}         // alt insert ezen belül getter and setter, kiválasztom, ezzel megcsinálhatom az összes változóra
