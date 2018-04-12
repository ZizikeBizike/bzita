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
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isDone) {

    if (isDone == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findBydone(!isDone));
    }
    return "todoslist";
  }

  @GetMapping(value={"/search", "/list/search"})
  public String searchByTitle(Model model, @RequestParam("todoName") String todoName) {
    model.addAttribute("todos", todoRepository.findByTitle(todoName));
    return"todoslist";
  }


  /*@PostMapping(value={"/{todoName}", "/list/{todoName}"})
  public String searchByTitle(Model model, @PathVariable("todoName") String todoName) {
    model.addAttribute("todos", todoRepository.findByTitle(todoName));
    return("redirect:/todo/list");
  }*/
}
