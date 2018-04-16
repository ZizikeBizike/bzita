package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Until;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UntilService {

  public Until sum(Until until) {
    until.setResult(0);
    for (int i = 1; i <= until.getUntil(); i++) {
      until.setResult(until.getResult() + i);
    }
    return until;
  }

  public Until factor(Until until) {
    until.setResult(1);
    for (int i = 1; i <= until.getUntil(); i++) {
      until.setResult(until.getResult() * i);
    }
    return until;
  }
}

