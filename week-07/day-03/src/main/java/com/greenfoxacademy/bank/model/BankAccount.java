package com.greenfoxacademy.bank.model;

import java.text.DecimalFormat;

public class BankAccount {

  private String name;
  private double balance;
  private String currency;
  private String animalType;

  public BankAccount(String name, double balance, String currency, String animalType) {
    this.name = name;
    this.balance = balance;
    //balance = String.format("%.2f");
    this.currency = currency;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getCurrency() {
    return currency;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
