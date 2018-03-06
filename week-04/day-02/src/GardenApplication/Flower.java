package GardenApplication;

public class Flower extends Plant {

  public Flower(String color) {
    this.color = color;
    waterAmount = 0;
    absorb = 0.75;
  }

  public void needsWaterFlower () {
    if (waterAmount < 5) {
      System.out.println("The " + color + " flower needs water");
    } else {
      System.out.println("The " + color + " flower doesn't need water");
    }
  }

}
