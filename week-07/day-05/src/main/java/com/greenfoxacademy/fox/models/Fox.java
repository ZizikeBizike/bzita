package com.greenfoxacademy.fox.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Fox {
  private String name;
  private ArrayList<String> listOfTricks;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
  }

  public Fox(String name, ArrayList<String> listOfTricks, String food, String drink) {
    this.name = name;
    this.listOfTricks = listOfTricks;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(ArrayList<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
