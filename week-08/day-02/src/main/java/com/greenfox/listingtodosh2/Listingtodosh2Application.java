package com.greenfox.listingtodosh2;

import com.greenfox.listingtodosh2.model.Todo;
import com.greenfox.listingtodosh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Listingtodosh2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Go with the project", false));
		todoRepository.save(new Todo("Eat something good", true));
		todoRepository.save(new Todo("Finish the project", false));
	}
}
