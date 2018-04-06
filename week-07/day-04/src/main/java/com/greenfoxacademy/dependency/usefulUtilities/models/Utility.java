package com.greenfoxacademy.dependency.usefulUtilities.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Utility {

  private String utilityName;
  private String utilityUrl;

  private ArrayList<Utility> utilities;

  public Utility() {
  }

  public Utility(String utilityName, String utilityUrl) {
    this.utilityName = utilityName;
    this.utilityUrl = utilityUrl;
  }

  public void addUtility(Utility utility) {
    utilities.add(utility);
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

  public ArrayList<Utility> getUtilities() {
    return utilities;
  }

  public void setUtilities(ArrayList<Utility> utilities) {
    this.utilities = utilities;
  }
}
