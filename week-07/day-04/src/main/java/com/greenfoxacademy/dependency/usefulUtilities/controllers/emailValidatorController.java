package com.greenfoxacademy.dependency.usefulUtilities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class emailValidatorController {

  @RequestMapping("/useful/email")
  public String validator(Model model) {
    return null;
  }

}
