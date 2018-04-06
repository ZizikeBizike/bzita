package com.greenfoxacademy.fox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/index")
  public String showStaticPage() {
    return "index";
  }
}
