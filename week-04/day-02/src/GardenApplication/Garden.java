package GardenApplication;

import java.util.ArrayList;

public class Garden {

  ArrayList<Plant> plantList = new ArrayList <Plant>();

  public void add (Plant plant) {
    plantList.add(plant);
  }

  public int countIfNeedsWater() {
    int counterOfThirstyPlants = 0;
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).needsWater = true) {
        counterOfThirstyPlants++;
      }
    }
    return counterOfThirstyPlants;
  }

  public void waterPlants(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).needsWater) {
        if (plantList.get(i).type.equals("tree")) {
          double treeAbsorptionRate = 0.4;
          plantList.get(i).waterAmount += ((wateringAmount/countIfNeedsWater())* treeAbsorptionRate);
        } else {
          double flowerAbsorptionRate = 0.75;
          plantList.get(i).waterAmount += ((wateringAmount/countIfNeedsWater()) * flowerAbsorptionRate);
        }
      }
    }
    setIfNeedsWater();
  }

  public void setIfNeedsWater() {
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).type.equals("tree") && plantList.get(i).waterAmount >= 10) {
        plantList.get(i).needsWater = false;
      } else if (plantList.get(i).type.equals("flower") && plantList.get(i).waterAmount >= 5 ) {
        plantList.get(i).needsWater = false;
      }
    }
  }

  public void getGardenStatus() {
    for (int i = 0; i < plantList.size(); i++) {
      System.out.println(plantList.get(i).getStatus());
    }
  }
}
