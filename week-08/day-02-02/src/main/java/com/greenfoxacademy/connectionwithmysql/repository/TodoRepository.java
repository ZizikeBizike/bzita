package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  public List<Todo> findBydone(boolean bool);
  public List<Todo> findByUrgent(boolean bool);
  public List<Todo> findByTitle(String title);
  public List<Todo> findAllByOrderById();
  public List<Todo> findByUrgentOrderById(boolean bool);
  public List<Todo> findBydoneOrderById(boolean bool);
  public List<Todo> findByTitleOrderById(String title);

  //public Todo findByTitle(String title);

  //public Optional<Todo> findByTitle(String title);

  /*@Query("SELECT t FROM Todo t where t.title = ?1")
  public Optional<Todo> findByTitle(String title);*/
}
