package com.greenfoxacademy.bank.model;

import java.text.DecimalFormat;

public class BankAccount {

  private String name;
  private String balance;
  private String animalType;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    balance = String.format(balance%.2f%);
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public DecimalFormat getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
