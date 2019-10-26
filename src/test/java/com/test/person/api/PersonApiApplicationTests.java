package com.test.person.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.person.api.PersonDAO;

@SpringBootTest
public class PersonApiApplicationTests {
	
	@Autowired
	PersonDAO personDAO;
	
	@Test
	public void getAllPersonListTest() {
	assertThat(personDAO.getAllPersons()).isNotNull();
	}

}
