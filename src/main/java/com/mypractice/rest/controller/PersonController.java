package com.mypractice.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypractice.rest.model.MathComponent;
import com.mypractice.rest.PersonApiApplication;
import com.mypractice.rest.model.Persons;

@RestController
@RequestMapping(path="/person")
public class PersonController {
Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	com.mypractice.rest.model.PersonDAO personDao;
	
	@Autowired
	MathComponent mathComponent;
	
	@GetMapping(path="/list")
	public Persons getPersons(){
		logger.info("loading person list");
		   //AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext();
	       //applicationContext2.scan("com.mypractice.rest.model");
	       //applicationContext2.refresh();
	       //com.mypractice.rest.model.MathComponent mathComponent = (com.mypractice.rest.model.MathComponent) applicationContext2.getBean("mc");
	        int r = mathComponent.add(4,5);
	       System.out.println(r);
		return personDao.getAllPersons();
	}

}
