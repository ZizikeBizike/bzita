package GardenApplication;

public class Flower {

  private int waterAmount;
  private String color;

  public void needsWater () {
    if (waterAmount < 5){
      System.out.println("The " + color + " flower needs water");
    } else {
      System.out.println("The " + color + " flower doesn't need water");
    }
  }

  public Flower(){
    waterAmount = 0;
  }
}
