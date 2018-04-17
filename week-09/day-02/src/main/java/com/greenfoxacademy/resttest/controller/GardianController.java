package com.greenfoxacademy.resttest.controller;

import com.greenfoxacademy.resttest.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GardianController {

  @RequestMapping("/groot")
  public Object groot (@RequestParam (value = "message", required = false) String someMessage) {
    if (someMessage == null) {
      return new Message();
    } else {
      return new Message(someMessage);
    }
  }
}
