package GardenApplication;

import java.util.ArrayList;

public class Application {

  public void main(String[] args) {
    ArrayList<Plant> plants = new ArrayList<>();

    Flower yellow = new Flower("yellow");
    plants.add(yellow);
    Flower blue = new Flower("blue");
    plants.add(blue);

    Tree purple = new Tree("purple");
    plants.add(purple);
    Tree orange = new Tree("orange");
    plants.add(orange);

    //needsWaterFlower(waterAmountPour);
    //needsWaterTree(waterAmountPour);
  }
}
