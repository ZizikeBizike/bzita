package com.greenfoxacademy.dependency.usefulUtilities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class LinkController {

  private ArrayList<String> listOfLinks = new ArrayList<>(Arrays.asList(
          "/useful/colored"
  ));

  @RequestMapping("/useful")
  public String showLinks() {
    return "listOfUtilities";
  }

  @RequestMapping("/useful/colored")
  public String colorBackground() {
    return "randomBackgroundColor";
  }
}
