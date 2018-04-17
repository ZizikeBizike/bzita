package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.*;
import com.greenfoxacademy.rest.service.UntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  UntilService untilService;

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

  @RequestMapping(value="/appenda/{appendable}")
  public Appenda appendaMethod(@PathVariable String appendable) {
    return new Appenda(appendable);
  }

  @RequestMapping(value="/dountil/{what}", method=RequestMethod.POST)
  public Until doUntilMethod(@PathVariable (required = false) String what, @RequestBody (required = false) Until until) {

    if (what.equals("sum")) {
      return untilService.sum(until);
    } else if (what.equals("factor")) {
      return untilService.factor(until);
    } else {
      return new Until();
    }
  }
}
