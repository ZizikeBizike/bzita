package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Greeting;
import com.greenfoxacademy.rest.model.NumberToDouble;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value="/doubling", method=RequestMethod.GET)
  public Object doubling (@RequestParam (value = "input", required = false) Integer input) {

    if (input == null) {
      return new NumberToDouble();
    } else {
      return new NumberToDouble(input);
    }
  }

  @RequestMapping(value="/greeter", method=RequestMethod.GET)
  public Greeting greetingMethod (@RequestParam (required = false) String name, @RequestParam (required = false)String title) {
    if (name == null) {
      return new Greeting();
    } else if (title == null){
      return new Greeting(title);
    } else {
      return new Greeting(name, title);
    }
  }
}
