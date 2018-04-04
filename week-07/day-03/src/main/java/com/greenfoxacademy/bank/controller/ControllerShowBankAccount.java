package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class ControllerShowBankAccount {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "Zebra", "lion");

  @RequestMapping("/show")
  public String show(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("currency", bankAccount.getCurrency());
    model.addAttribute("animalType", bankAccount.getAnimalType());

    return "showAccount";
  }
}
