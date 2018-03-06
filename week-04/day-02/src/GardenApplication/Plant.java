package GardenApplication;

import java.util.ArrayList;

public class Plant {

  public String color;
  public double waterAmount;
  public double absorb;

  private ArrayList<Flower> flowers;
  private ArrayList<Tree> trees;

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public Plant() {
    flowers = new ArrayList<>();
    trees = new ArrayList<>();
  }
}
