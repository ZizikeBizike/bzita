package com.greenfoxacademy.resttest.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Arrow {

  private double distance;
  private double time;
  private double speed;
  private String error;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public Arrow() {
    error = "There is no input parameter";
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
