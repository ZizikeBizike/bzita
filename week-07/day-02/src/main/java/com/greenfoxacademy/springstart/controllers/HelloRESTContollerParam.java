package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTContollerParam {

  @RequestMapping("/greetingParam")
  public Greeting greetingMethod(@RequestParam("name") String name) {
    return new Greeting(1, "Hello " + name + "!");
  }
}
  //http://localhost:8080/greeting?name=Yourname  