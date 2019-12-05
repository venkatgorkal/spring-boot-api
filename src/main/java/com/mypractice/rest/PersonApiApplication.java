package com.mypractice.rest;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mypractice.rest.model.Persons;


@SpringBootApplication(scanBasePackages = "com.mypractice.*")
public class PersonApiApplication {
	public static void main(String[] args) {
		//SpringApplication.run(PersonApiApplication.class, args);
		ApplicationContext applicationContext = 
				SpringApplication.run(PersonApiApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
