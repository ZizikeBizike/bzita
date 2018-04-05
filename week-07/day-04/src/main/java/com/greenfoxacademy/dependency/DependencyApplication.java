package com.greenfoxacademy.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

	@Autowired
	Printer printer;

	@Autowired
	MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		System.out.println(printer.log("Hello"));
		System.out.println(printer.log(myColor.printColor()));
	}
}
