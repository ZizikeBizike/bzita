package com.greenfoxacademy.reddit.models;


import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
public class Post {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;

  private String title;
  private String url;
  private int rating;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    rating = 0;
  }

  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int counter) {
    this.rating = counter;
  }
}
