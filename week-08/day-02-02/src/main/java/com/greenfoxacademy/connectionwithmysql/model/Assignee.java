package com.greenfoxacademy.connectionwithmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String nameOfAssignee;
  private String email;

  public Assignee(String nameOfAssignee, String email) {
    this.nameOfAssignee = nameOfAssignee;
    this.email = email;
  }

  public Assignee() {
  }

  public String getNameOfAssignee() {
    return nameOfAssignee;
  }

  public void setNameOfAssignee(String nameOfAssignee) {
    this.nameOfAssignee = nameOfAssignee;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
