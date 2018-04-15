package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  @Autowired
  Post post;

  @Autowired
  PostRepository postRepository;

  @RequestMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "postList";
  }

  @RequestMapping("/{id}/upVote")
  public String upVote(@PathVariable(name="id") long id) {
    post = postRepository.findById(id).get();
    post.setRating(post.getRating() + 1);
    postRepository.save(post);
    return "redirect:/";
  }

  @RequestMapping("/{id}/downVote")
  public String downVote(@PathVariable(name="id") long id){
    post = postRepository.findById(id).get();
    post.setRating(post.getRating() - 1);
    postRepository.save(post);
    return"redirect:/";
  }

  @GetMapping("/submit")
  public String showSubmitPage() {
    return "submitNewPost";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute (name = "postName") String postName, @ModelAttribute (name = "postUrl") String postUrl, Model model) {
    postRepository.save(new Post(postName, postUrl));
    return "redirect:/";
  }
}
