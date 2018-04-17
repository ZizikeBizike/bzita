package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.ArrayHandler;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {

  public ArrayHandler sum(ArrayHandler numbers) {
    numbers.setResult(0);
    for(int i : numbers.getNumbers())
       numbers.setResult(numbers.getResult() + i);
    return numbers;
  }

  public ArrayHandler multiply(ArrayHandler numbers) {
    numbers.setResult(1);
    for(int i : numbers.getNumbers())
      numbers.setResult(numbers.getResult() * i);
    return numbers;
  }

  public ArrayHandler doubling(ArrayHandler numbers) {
    for(int i : numbers.getNumbers())
      numbers.setResult(numbers.getResult() * 2);
    return numbers;
  }
}
