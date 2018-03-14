package GardenApplication;

public class Plant {
  protected String color;
  protected int waterAmount;
  protected String type;
  protected boolean needsWater;

  public Plant (String color) {
    this.color = color;
    this.type = type;
    this.needsWater = true;
  }

  public String printNeedsWater() {
    if (needsWater) {
      return " needs water";
    } else {
      return " doesn't need water";
    }
  }

  public String getStatus() {
    return "The " + color + " " + type + printNeedsWater();
  }
}