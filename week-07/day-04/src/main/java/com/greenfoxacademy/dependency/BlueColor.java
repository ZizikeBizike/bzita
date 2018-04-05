package com.greenfoxacademy.dependency;

import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {

  @Override
  public String printColor() {
    return "It is blue in color...";
  }
}
