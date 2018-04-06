package com.greenfoxacademy.fox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping ("/")
  public String showPage(@RequestParam("username") String name) {
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
