package GardenApplication;

public class Tree {

  private int waterAmount;
  private String color;

  public void needsWater(){
    if (waterAmount < 10){
      System.out.println("The " + color + " tree needs water");
    } else {
      System.out.println("The " + color + " tree doesn't need water");
    }
  }

  public Tree(){
    waterAmount = 0;
  }
}
