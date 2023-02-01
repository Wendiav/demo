package com.example.demo;

import com.example.demo.models.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan("com.example.demo.*")
public class DemoApplication  {
	//implements CommandLineRunner

	@Autowired
	CatRepository catRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Cat cat = new Cat();
		cat.setBreed("Chartreux");
		cat.setOrigin("France");
		cat.setType("Natural");
		cat.setBodyType("Muscular cobby");
		cat.setCoat("Varying");
		catRepository.save(cat);

		Cat cat1 = new Cat();
		cat.setBreed("Turkish Van");
		cat.setOrigin("England");
		cat.setType("Natural");
		cat.setBodyType("Semi-cobby");
		cat.setCoat("Van pattern");
		catRepository.save(cat1);

		Cat cat2 = new Cat();
		cat.setBreed("Singapura");
		cat.setOrigin("The United States");
		cat.setType("Mutation");
		cat.setBodyType("Small");
		cat.setCoat("Ticked tabby");
		catRepository.save(cat2);

	}*/
}
