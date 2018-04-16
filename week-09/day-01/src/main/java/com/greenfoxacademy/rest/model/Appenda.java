package com.greenfoxacademy.rest.model;

public class Appenda {

  private String appendable;
  private String appended;

  public Appenda(String appendable) {
    appended = appendable + "a";
  }

  public String getAppendable() {
    return appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
