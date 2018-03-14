package GardenApplication;

public class Application {

  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellowFlower = new Flower("yellow");
    Plant blueFlower = new Flower("blue");
    Plant purpleTree = new Tree("purple");
    Plant orangeTree = new Tree("orange");

    myGarden.add(yellowFlower);
    myGarden.add(blueFlower);
    myGarden.add(purpleTree);
    myGarden.add(orangeTree);

    myGarden.getGardenStatus();
    myGarden.waterPlants(40);
    myGarden.getGardenStatus();
    myGarden.waterPlants(70);
    myGarden.getGardenStatus();
  }
}
