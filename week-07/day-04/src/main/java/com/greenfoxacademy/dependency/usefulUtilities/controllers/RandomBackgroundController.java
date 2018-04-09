package com.greenfoxacademy.dependency.usefulUtilities.controllers;

import com.greenfoxacademy.dependency.usefulUtilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomBackgroundController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful/colored")
  public String colorBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "randomBackgroundColor";
  }
}
