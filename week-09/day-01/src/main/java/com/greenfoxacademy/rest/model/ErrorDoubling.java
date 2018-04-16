package com.greenfoxacademy.rest.model;

public class ErrorDoubling {

  private String error;

  public ErrorDoubling() {
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
