package GreenFoxOrganization;

public class Student extends Person implements Cloneable {

  public String previousOrganization;
  public int skippedDays;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    skippedDays = 0;         //!!!I do not need this.skippedDays, because I do not have skippedDays in the parenthesis
  }

  public Student(){
    super();//with this I have the variables as in Person Class, this time I have empty parenthesis
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Object clone () throws CloneNotSupportedException {
    return super.clone();
  }
}
