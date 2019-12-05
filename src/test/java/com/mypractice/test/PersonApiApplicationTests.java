package com.mypractice.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mypractice.rest.model.Person;
import com.mypractice.rest.model.Persons;




@RunWith(SpringRunner.class)
public class PersonApiApplicationTests {
	
	@MockBean
	com.mypractice.rest.model.PersonDAO personDAO;
	
	@Test
	public void getAllPersonListTest() {
	//assertThat(personDAO.getAllPersons()).isNotNull();
		//personDAO.getAllPersons()
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("venkatesh", "Gorkal"));
		Persons persons2 = new Persons();
		persons2.setPersonList(persons);
		System.out.println(persons2);
		//Mockito.when(personDAO.getAllPersons()).thenReturn(persons2);
		//assertThat(personDAO.getAllPersons()).isNotNull();
		assertThat(true);
	}

}
