package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;

  @RequestMapping("/list")
  public String listAssignees(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assigneesList";
  }
}
