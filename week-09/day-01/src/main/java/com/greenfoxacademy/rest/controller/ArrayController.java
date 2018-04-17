package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ArrayHandler;
import com.greenfoxacademy.rest.service.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

  @Autowired
  ArrayService arrayService;

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public ArrayHandler arrayHandlerMethod(@PathVariable String what, @RequestBody (required = false) ArrayHandler arrayHandler) {

    if (what.equals("sum")) {
      arrayService.sum(arrayHandler);
    } else if (what.equals("multiply")) {
      arrayService.multiply(arrayHandler);
    } else if (what.equals("double")) {
      arrayService.doubling(arrayHandler);
    } else {

    }
    return null;
  }
}
