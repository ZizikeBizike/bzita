package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ErrorDoubling;
import com.greenfoxacademy.rest.model.NumberToDouble;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value="/doubling", method=RequestMethod.GET)
  public Object doubling (@RequestParam (value = "input", required = false) Integer input) {
    if (input == null) {
      return new ErrorDoubling();
    } else {
      return new NumberToDouble(input);
    }
  }
}
