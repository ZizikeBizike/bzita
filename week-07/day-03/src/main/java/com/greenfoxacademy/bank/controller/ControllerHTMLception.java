package com.greenfoxacademy.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHTMLception {

  @RequestMapping("/enjoy")
  public String enjoy(Model model) {
    model.addAttribute("sentence", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "enjoy";     //in this case it is the name of the html file (not the endpoint)
  }
}
