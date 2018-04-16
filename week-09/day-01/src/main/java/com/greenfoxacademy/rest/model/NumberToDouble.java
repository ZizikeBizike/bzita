package com.greenfoxacademy.rest.model;

public class NumberToDouble {

  private int received;
  private int result;
  private String error;

  public NumberToDouble(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public NumberToDouble() {
    this.error = "Please provide an input!";
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
