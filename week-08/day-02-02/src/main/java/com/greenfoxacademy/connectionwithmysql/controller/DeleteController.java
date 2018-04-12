package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping("/{id}/delete")
  public String delete(@PathVariable("id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }
}
