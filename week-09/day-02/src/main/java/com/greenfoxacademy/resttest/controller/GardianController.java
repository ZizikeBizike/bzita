package com.greenfoxacademy.resttest.controller;

import com.greenfoxacademy.resttest.model.Arrow;
import com.greenfoxacademy.resttest.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GardianController {

  @RequestMapping("/groot")
  public Message groot (@RequestParam (value = "message", required = false) String someMessage) {
    if (someMessage == null) {
      return new Message();
    } else {
      return new Message(someMessage);
    }
  }

  @RequestMapping("/yondu")
  public Arrow arrow (@RequestParam (required = false) Double distance, @RequestParam (required = false) Double time) {
    if (distance == null || time == null) {
      return new Arrow();
    } else {
      return new Arrow(distance, time);
    }
  }
}
