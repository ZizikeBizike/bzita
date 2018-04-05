package com.greenfoxacademy.dependency.usefulUtilities.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Utility {

  private String utilityName;
  private String utilityUrl;

  public Utility() {
  }

  public Utility(String utilityName, String utilityUrl) {
    this.utilityName = utilityName;
    this.utilityUrl = utilityUrl;
  }

  public String getUtilityName() {
    return utilityName;
  }

  public void setUtilityName(String utilityName) {
    this.utilityName = utilityName;
  }

  public String getUtilityUrl() {
    return utilityUrl;
  }

  public void setUtilityUrl(String utilityUrl) {
    this.utilityUrl = utilityUrl;
  }
}
