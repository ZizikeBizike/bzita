package GardenApplication;

public class Tree extends Plant {

  public Tree(String color){
    this.color = color;
    waterAmount = 0;
    absorb = 0.4;
  }

  public void needsWaterTree() {
    if (waterAmount < 10) {
      System.out.println("The " + color + " tree needs water");
    } else {
      System.out.println("The " + color + " tree doesn't need water");
    }
  }
}
