package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

public class ArrayHandler {

  private int[] numbers;
  private String what;
  private int result;
  private String error;

  public ArrayHandler(int[] numbers, String what) {
    this.numbers = numbers;
    this.what = what;
  }

  public ArrayHandler() {
    error = "Please provide what to do with the numbers!";
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
