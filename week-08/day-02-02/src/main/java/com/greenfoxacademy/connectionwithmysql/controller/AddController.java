package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/todo")
public class AddController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value="/add")
  public String addTodo(){
    return "showAddTodoPage";
  }

  @PostMapping(value="/add")
  public String add (@RequestParam("todoName") String todoTitle) {
    Todo newTodo = new Todo(todoTitle);
    todoRepository.save(newTodo);
    return "redirect:/todo/list";
  }


}
