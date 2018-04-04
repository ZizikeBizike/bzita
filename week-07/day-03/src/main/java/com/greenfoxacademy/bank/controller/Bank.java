package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;

import java.util.ArrayList;

public class Bank {

  private ArrayList<BankAccount> bank = new ArrayList<BankAccount>();

  public Bank(){}

  public void addBankAccount (BankAccount bankAccount) {
    bank.add(bankAccount);
  }

  public ArrayList<BankAccount> getBank() {
    return bank;
  }
}
