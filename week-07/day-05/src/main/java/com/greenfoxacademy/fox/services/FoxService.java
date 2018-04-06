package com.greenfoxacademy.fox.services;

import com.greenfoxacademy.fox.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class FoxService {

  ArrayList<Fox> foxes = new ArrayList<>(Arrays.asList(
          new Fox("Fifi", new ArrayList<String>(Arrays.asList("do magic", "ride a bike")), "hamburger", "Coca cola"),
          new Fox("Fufu", new ArrayList<String>(Arrays.asList("sing", "do handstand")), "pizza", "beer"),
          new Fox("Fufu", new ArrayList<String>(Arrays.asList("play the guitar")), "pancake", "wine")
  ));

  public void addNewFox(Fox fox) {
    foxes.add(fox);
  }
}
