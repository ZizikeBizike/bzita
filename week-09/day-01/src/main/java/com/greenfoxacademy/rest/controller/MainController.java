package com.greenfoxacademy.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static jdk.nashorn.internal.runtime.PropertyDescriptor.GET;

@Controller
public class MainController {

  @RequestMapping("/")
  public String frontend() {
    return "index";
  }
}
