package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTContollerParam {

  private AtomicLong count = new AtomicLong();

  @RequestMapping("/greetingParam")
  public Greeting greetingMethod(@RequestParam("name") String name) { //http://localhost:8080/greeting?name=Yourname
    return new Greeting(1, "Hello " + name + "!");
  }

  @RequestMapping("/greetingParamAtomic")
  public Greeting greetingMethod2(@RequestParam("name") String name) { //http://localhost:8080/greeting?name=Yourname
    return new Greeting(count.incrementAndGet(), "Hello " + name + "!");
  }
}
