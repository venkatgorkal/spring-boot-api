package com.test.person.api;

import java.util.ArrayList;
import java.util.List;

public class Persons {
	 private List<Person> personList;
     
	    public List<Person> getPersonList() {
	        if(personList == null) {
	        	personList = new ArrayList<>();
	        }
	        return personList;
	    }
	  
	    public void setPersonList(List<Person> personList) {
	        this.personList = personList;
	    }

}
