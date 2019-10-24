package com.test.person.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.person.api.model.Person;
import com.test.person.api.model.PersonDAO;
import com.test.person.api.model.Persons;

@SpringBootApplication
@RestController

@RequestMapping(path="/person")
public class PersonApiApplication {
	
	@Autowired
	PersonDAO personDao;
	
	@GetMapping(path="/list")
	public Persons getPersons(){
		return personDao.getAllPersons();
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
