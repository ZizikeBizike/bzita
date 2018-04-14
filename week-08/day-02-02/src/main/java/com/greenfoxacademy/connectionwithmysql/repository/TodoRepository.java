package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  public List<Todo> findAllByOrderById();
  public List<Todo> findByUrgentOrderById(boolean bool);
  public List<Todo> findBydoneOrderById(boolean bool);
  public List<Todo> findByTitleOrderById(String title);
}
