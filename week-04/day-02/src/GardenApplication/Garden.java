package GardenApplication;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Flower> flowers;
  private ArrayList<Tree> trees;

  public void water(){

  }

  public void addFlower(Flower flower){
    flowers.add(flower);
  }

  public void addTree(Tree tree){
    trees.add(tree);
  }

  public Garden(){
    flowers = new ArrayList<>();
    trees = new ArrayList<>();
  }
}
