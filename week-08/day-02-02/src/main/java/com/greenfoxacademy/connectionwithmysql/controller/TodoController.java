package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value={"/", "/list"})
  public String list(Model model) {

    model.addAttribute("todos", todoRepository.findAllByOrderById());
    return "todoslist";
  }

  @GetMapping(value={"/search", "/list/search"})
  public String searchByTitle(Model model, @RequestParam("searchInput") String searchInput) {

    if(searchInput.equals("urgent")) {
      model.addAttribute("todos", todoRepository.findByUrgentOrderById(true));
    } else if (searchInput.equals("active")) {
      model.addAttribute("todos", todoRepository.findBydoneOrderById(false));
    } else {
      model.addAttribute("todos", todoRepository.findByTitleOrderById(searchInput));
    }
    return "todoslist";
  }
}
