package com.greenfoxacademy.dependency.usefulUtilities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

  @RequestMapping("/useful")
  public String showLinks() {
    return "listOfUtilities";
  }
}
