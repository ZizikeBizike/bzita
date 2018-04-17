package com.greenfoxacademy.rest.model;

import com.greenfoxacademy.rest.service.UntilService;
import org.springframework.beans.factory.annotation.Autowired;

public class Until {

  private Integer until;
  private Integer result;
  private String error;

  public Until(int until) {
    this.until = until;
    error = null;
  }

  public Until() {
    error = "Please provide a number!";
    until = null;
    result = null;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
