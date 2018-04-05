package com.greenfoxacademy.dependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
