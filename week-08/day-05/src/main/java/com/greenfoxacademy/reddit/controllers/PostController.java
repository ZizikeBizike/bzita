package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "postList";
  }
}
