package com.greenfoxacademy.fox.controllers;

import com.greenfoxacademy.fox.models.Fox;
import com.greenfoxacademy.fox.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private FoxService foxService;

  @RequestMapping ("/")
  public String showPage(@RequestParam("username") String name, Model model) {
    Fox newFox = new Fox(name);
    foxService.addNewFox(newFox);
    model.addAttribute("newFox", newFox);
    return "index";
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam("username") String name) {
    return "redirect:/?username=" + name;
  }

}
