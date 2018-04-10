package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {

    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findBydone(!isActive));
    }
    return "todoslist";
  }
}
