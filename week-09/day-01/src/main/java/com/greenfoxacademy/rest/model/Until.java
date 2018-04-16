package com.greenfoxacademy.rest.model;

import com.greenfoxacademy.rest.service.UntilService;
import org.springframework.beans.factory.annotation.Autowired;

public class Until {

  @Autowired
  UntilService untilService;

  private int until;
  private int result;
  private String error;

  public Until(int until) {
    this.until = until;
  }

  public Until() {
    error = "Please provide a number!";
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
