package com.greenfox.listingtodosh2.repository;

import com.greenfox.listingtodosh2.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
