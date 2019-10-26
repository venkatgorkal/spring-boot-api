package com.test.person.api;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.person.api.Person;
import com.test.person.api.PersonDAO;
import com.test.person.api.Persons;


@SpringBootApplication(scanBasePackages = "com.test.person.api")
@RestController

@RequestMapping(path="/person")
public class PersonApiApplication {
	
	Logger logger = LoggerFactory.getLogger(PersonApiApplication.class);
	
	@Autowired
	PersonDAO personDao;
	
	@GetMapping(path="/list")
	public Persons getPersons(){
		logger.info("loading person list");
		return personDao.getAllPersons();
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
